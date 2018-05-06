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
public class Division {

    public void resolver(Object[] args) {

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
            }

        }
    }
}
