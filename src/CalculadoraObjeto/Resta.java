/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraObjeto;

/**
 *
 * @author Jesica
 */
public class Resta {

    

    public void resolver(Object [] args1) {
        if (args1 != null) {
            String arg1 = args1[0].toString();
            double num1 = Double.valueOf(arg1);
            String arg2 = args1[1].toString();
            double num2 = Double.valueOf(arg2);
            System.out.println("RESTA=\t\t\t" + (num1 - num2));
        }
    }

}
