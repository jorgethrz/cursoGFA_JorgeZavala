/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Arrays;

/**
 *
 * @author aj.zavala
 */
public class Operaciones {
    public static int Suma(int[] arreglo)
    {
      int suma=0;
      for(int i=0;i<arreglo.length;i++)
          suma= suma + arreglo[i];
      return suma;
    }
    
    public static int Media(int[] arreglo)
    {
      return Suma(arreglo)/arreglo.length;
    }
    
    public static int Mayor(int[] arreglo)
    {
      //int mayor=0;
      //for(int i=0;i<arreglo.length;i++)
      //{
      //  if(arreglo[i]>mayor)
      //      mayor=arreglo[i];
      //}
      
      Arrays.sort(arreglo);
      return arreglo[arreglo.length -1];
      
      //return mayor;
    }
}
