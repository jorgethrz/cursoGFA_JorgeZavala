/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05ciclos;
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
        // TODO code application logic here
        
        String[] nombres = new String[5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++)
            nombres[i]= s.next();
        for(int i=0;i<5;i++)
            System.out.println("Nombre: " + (i) + " " + nombres[i]);  
    }
    
}
