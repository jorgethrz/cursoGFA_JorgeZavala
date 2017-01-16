/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12expresionlamdaarreglo;

import arreglo.Arreglo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        
        Arreglo pares = (List<Integer> arreglito)->{
         List<Integer> arregloPar=new ArrayList<Integer>();
         for(int a:arreglito)
         {
           if(a % 2 == 0 )
           {
             arregloPar.add(a);
           }
         }
         return arregloPar;
        };
        
        Arreglo Impares = (List<Integer> arreglito)->{
         List<Integer> arregloPar=new ArrayList<Integer>();
         for(int a:arreglito)
         {
           if(a % 2 != 0 )
           {
             arregloPar.add(a);
           }
         }
         return arregloPar;
        };
        
        List<Integer> arreglo = Arrays.asList(2,5,7,1,3,2);
        System.out.println("Pares");
        imprimirArreglo(arreglo, pares);
        System.out.println("Impares");
        imprimirArreglo(arreglo, Impares);       
    }
    
    public static void imprimirArreglo(List<Integer> arreglito,Arreglo arreglo)
    {
       for(int a: arreglo.procesar(arreglito))
       {
           System.out.println(a);
       }
    }
    
}
