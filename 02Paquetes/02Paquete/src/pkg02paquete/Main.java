/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02paquete;
import matematicas.Matematicas;
import java.util.Scanner;
/**
 *
 * @author aj.zavala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        double a,b;
        
        System.out.println("Introduce un Numero");
        a=lector.nextDouble();
        System.out.println("Introduce otro Numero");
        b=lector.nextDouble();
        
        System.out.println("Resultado: " + Matematicas.Suma(a, b));
    }
    
}
