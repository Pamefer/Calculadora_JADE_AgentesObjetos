/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import CalculadoraObjeto.CalculadoraconObjetos;
import calculadoraAgente.numeros;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        //aleatorio
        int ope1 = (int) (Math.random() * 100000 + 1);
        int ope2 = (int) (Math.random() * 100000 + 1);
        Object numeros1[] = {ope1, ope2};

        CalculadoraObjeto.CalculadoraconObjetos coo = new CalculadoraconObjetos();
        //llama al metodo resolver con programacion
        coo.resolver(numeros1);
        
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        //Se crea el perfil por defecto
        Profile profile = new ProfileImpl(null, 1099, null);
        //se crea el contenedor principal
        AgentContainer mainContainer = runtime.createMainContainer(profile);
        //Permite arrancar los agentes Suma, Resta, Multiplicacion y Division
        AgentController agenteController;
        try {
            //crea el agente controlador para resoover con programacion orientada a agentes
            agenteController = mainContainer.createNewAgent("AgenteControlador", numeros.class.getName(), numeros1);
            agenteController.start();

        } catch (Exception e) {
            System.out.println("finalizos debido a " + e);
            Logger.getLogger(numeros.class.getName()).log(Level.SEVERE, null, e);
        }

    }

}
