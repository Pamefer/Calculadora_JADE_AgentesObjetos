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
public class Multiplicacion {

    

    public void resolver(Object [] args) {
        
        if (args != null) {
            String arg1 = args[0].toString();
            double num1 = Double.valueOf(arg1);
            String arg2 = args[1].toString();
            double num2 = Double.valueOf(arg2);
            System.out.println("MULTIPLICACION=\t\t" + (num1 * num2));
        }
    }

}
