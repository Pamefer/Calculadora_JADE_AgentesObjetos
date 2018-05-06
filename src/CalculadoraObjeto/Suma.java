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
public class Suma {
    
    public void resolver(Object [] args){
            //Object[] args = getArguments(); //Obtiene nos argumentos enviados desde la Clase Calculadora
            if (args != null) {
                String arg1 = args[0].toString();
                double num1 = Double.valueOf(arg1);
                String arg2 = args[1].toString();
                double num2 = Double.valueOf(arg2);
                System.out.println("SUMA=\t\t\t" + (num1 + num2));
            }

    }
    
    
}
