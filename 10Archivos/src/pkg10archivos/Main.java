/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

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
        
        String url="C:\\Nuevacarpeta\\errores.txt";
        Error s2= new Error();
        s2.leer(url, 1484418991409l);
        System.out.println(s2);
        
        //Scanner s= new Scanner(System.in);
        //Error err = new Error(s.nextInt(),s.next());
        //err.escribir(url);
        
    }
    
}
