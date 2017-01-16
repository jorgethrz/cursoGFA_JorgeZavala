/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportista;

import persona.Persona;

/**
 *
 * @author aj.zavala
 */
public class Boxeador extends Persona implements Deporte{
  String peso;
  
    public Boxeador(String nombre, String apellido, int edad,String peso) {
        super(nombre, apellido, edad);
        this.peso = peso;
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        System.out.println("Al gimnasion a las 5am");
    }

    @Override
    public void viajar() {
           System.out.println("Viaja para la pelea");
    }
    
    
}
