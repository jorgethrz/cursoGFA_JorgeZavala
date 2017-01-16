/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportista;

/**
 *
 * @author aj.zavala
 */
public class Futbolista extends persona.Persona implements Deporte{
    private String posicion;
    private int dorsal;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
    public Futbolista(String nombre, String apellido, int edad,String posicion, int dorsal) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
//    @Override
//    public void hablar()
//    {
//        System.out.println("deportista.Futbolista.hablarFutbolista()");
//    }
//    
//    @Override
//    public void comer()
//    {
//    System.out.println("deportista.Futbolista.comerFutbolista()");
//    }

    @Override
    public void jugar() {
        System.out.println("Juega  un partido");
    }

    @Override
    public void entrenar() {
        System.out.println("Cardio...");
    }

    @Override
    public void viajar() {
          System.out.println("Al gimnasion a las 5am");
    }
    
}
