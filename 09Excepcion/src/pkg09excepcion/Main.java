/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09excepcion;

import boleto.Boleto;
import boleto.FechaInvalidaBoletoException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aj.zavala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here
            
            
            //System.out.println(args[1]);
            
            Boleto b = new Boleto();
            b.setFecha(new Date("05/25/2016"));
        } catch (FechaInvalidaBoletoException ex) {
            ex.printStackTrace();
        }
         
        
    }
    
}
