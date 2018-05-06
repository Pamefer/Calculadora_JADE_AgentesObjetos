/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraAgente;

import jade.core.*;
import jade.lang.acl.*;
import jade.core.behaviours.*;

/**
 *
 * @author Jesica
 */
public class agenteSuma extends Agent {

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
                System.out.println("SUMA=\t\t\t" + (num1 + num2));
                fin=true;
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
