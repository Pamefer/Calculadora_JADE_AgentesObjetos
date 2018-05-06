/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraObjeto;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class CalculadoraconObjetos {

    /**
     * @param args the command line arguments
     */
    public void resolver(Object[] numeros) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        Scanner s = new Scanner(System.in);
        //Numeros numero = new Numeros();
        //Presenta menu de la calculadora
        System.out.println("=================Calculadora con Orientación a Objetos==================");

        System.out.println("OPERACION\t\tRESULTADO");
        Suma suma = new Suma();
        //llama a cada operacion
        suma.resolver(numeros);
        Resta resta = new Resta();
        resta.resolver(numeros);
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.resolver(numeros);
        Division division = new Division();
        division.resolver(numeros);
        long stopTime = System.currentTimeMillis();
        long tiempoOO = stopTime - startTime;
        System.out.println("Tiempo de metodo Orientado a Objetos edds: " + tiempoOO * 0.001 );
        System.out.println("segundos");

    }

}
