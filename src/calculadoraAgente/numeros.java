/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraAgente;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import jade.wrapper.AgentController;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class numeros extends Agent {

    class ComportamientoSuma extends SimpleBehaviour {

        public void action() {
            try {
                agenteController = mainContainer.createNewAgent("AgenteSuma", agenteSuma.class.getName(), args);
                agenteController.start();
            } catch (Exception e) {
            }
        }

        public boolean done() {
            return true;
        }
    }

    class ComportamientoResta extends SimpleBehaviour {

        public void action() {
            try {
                agenteController = mainContainer.createNewAgent("AgenteResta", agenteResta.class.getName(), args);
                agenteController.start();
            } catch (Exception e) {
            }
        }

        public boolean done() {
            return true;
        }
    }

    class ComportamientoMultiplicacion extends SimpleBehaviour {

        public void action() {
            try {
                agenteController = mainContainer.createNewAgent("AgenteMultiplicacion", agenteMultiplicacion.class.getName(), args);
                agenteController.start();
            } catch (Exception e) {
            }
        }

        public boolean done() {

            return true;
        }
    }

    class ComportamientoDivision extends SimpleBehaviour {

        public void action() {
            try {
                Object numeros[] = {num1, num2, starTime};
                agenteController = mainContainer.createNewAgent("AgenteDivision", agenteDivision.class.getName(), numeros);
                agenteController.start();

            } catch (Exception e) {
            }//        
        }

        public boolean done() {
            return true;
        }
    }

    // numeros n = new numeros();
    String num1;
    String num2;
    long tiempoOA = System.currentTimeMillis();
    long stopTime = System.currentTimeMillis();
    long starTime = System.currentTimeMillis();
    jade.core.Runtime runtime = jade.core.Runtime.instance();
    //Se crea el perfil por defecto
    Profile profile = new ProfileImpl(null, 1099, null);
    //se crea el contenedor principal
    jade.wrapper.AgentContainer mainContainer = runtime.createMainContainer(profile);
    //Permite arrancar los agentes Suma, Resta, Multiplicacion y Division
    AgentController agenteController;
    Object[] args;

    protected void setup() {
        // Muestra la interfaz de usuario

        starTime = System.currentTimeMillis();
        args = getArguments();
        num1 = args[0].toString();
        num2 = args[1].toString();

        System.out.println("=================Calculadora orientada Agentes==================");
        SequentialBehaviour s1 = new SequentialBehaviour(this);
        //aniade metodos secuenciales
        s1.addSubBehaviour(new ComportamientoSuma());
        s1.addSubBehaviour(new ComportamientoResta());
        s1.addSubBehaviour(new ComportamientoMultiplicacion());
        s1.addSubBehaviour(new ComportamientoDivision());
        ParallelBehaviour p = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL);
        //aniade al comportamientoa paralelo
        p.addSubBehaviour(s1);
        //se los ejecuta
        addBehaviour(p);

    }

    public boolean done() {
        
        doDelete();
        return true;
    }

}
