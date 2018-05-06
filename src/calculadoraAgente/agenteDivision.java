/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraAgente;

import jade.core.*;
import jade.lang.acl.*;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.SimpleBehaviour;

/**
 *
 * @author Jesica
 */
public class agenteDivision extends Agent {

    class Comportaminento extends SimpleBehaviour {

        private boolean fin = false;

        public void action() {
            //Obtiene los argumentos
            Object[] args = getArguments();
            if (args != null) {
                String arg1 = args[0].toString();
                double num1 = Double.valueOf(arg1);
                String arg2 = args[1].toString();
                double num2 = Double.valueOf(arg2);
                if (num2 == 0) {
                    System.out.println("No se puede realiar divisiones para 0");
                } else {

                    double res = (num1 / num2);
                    System.out.println("DIVISION=\t\t" + res);
                    long stopTime = System.currentTimeMillis();
                    long st = Long.valueOf(args[2].toString());
                    long tiempoOA = stopTime - st;
                    System.out.println("Tiempo de metodo Orientado a Agentes es: " + tiempoOA * 0.001);
                    System.out.println("segundos");
                }

                fin = true;
            } else {
                //se bloquea en caso de no relizar ninguna operacion
                block();
            }
        }

        public boolean done() {
            return fin;
        }
    }

    protected void setup() {
        addBehaviour(new Comportaminento());

    }
}
