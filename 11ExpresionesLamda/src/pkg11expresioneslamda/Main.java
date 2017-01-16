/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11expresioneslamda;

import matematica.Matematica;

/**
 *
 * @author aj.zavala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematica suma = (a,b)->a+b;
        Matematica resta = (a,b)->a-b;
        Matematica multiplicacion = (a,b)->a*b;
        Matematica division = (a,b)->a/b;
        
        System.out.println("Suma="+ operar(10f,20f,suma));
        System.out.println("Resta="+ operar(10f,20f,resta));
        System.out.println("Multiplicacion="+ operar(10f,20f,multiplicacion));
        System.out.println("division="+ operar(10f,20f,division));
    }
    
    public static float operar(float a,float b,Matematica operacion)
    {
      return operacion.Operacion(a, b);
    }
    
}
