/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06examen1;
import java.util.Scanner;
import operaciones.Operaciones;

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
        Scanner s = new Scanner(System.in);
        System.out.println("Captura el numero de elementos");
        int tamano = s.nextInt();
        int[] arreglo= new int[tamano];
        for(int i=0;i<tamano;i++)
        {
          System.out.println("Captura el elemento " + (i +1) + ": ");
          arreglo[i] = s.nextInt();
        }
        
        System.out.println("Suma -> 1");
        System.out.println("Media -> 2");
        System.out.println("Mayor -> 3");
        int opcion=s.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println(Operaciones.Suma(arreglo));
                break;
            case 2:
                System.out.println(Operaciones.Media(arreglo));
                break;
            case 3:
                System.out.println(Operaciones.Mayor(arreglo));
                break;
        }
        
    }
    
}
