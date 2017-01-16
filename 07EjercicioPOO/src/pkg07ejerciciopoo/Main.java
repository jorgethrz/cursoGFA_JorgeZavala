/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07ejerciciopoo;

import deportista.Boxeador;
import deportista.Deporte;
import deportista.Futbolista;
import javafx.scene.shape.Box;
import oficina.Desarrollador;
import persona.Persona;

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
        Persona persona = new Persona("Jorge Zavala");
        persona.setEdad(18);
        imprimir(persona);
        Persona persona2 = new Persona("Jorge","Zavala",19);
        persona2.hablar();
        imprimir(persona2);
        
        Futbolista fut = new Futbolista("Jorge", "Zavala", 18, "Delantero", 4);
        fut.hablar();
        
        Desarrollador des = new  Desarrollador("Jorge Zavala", "Antonio griesman", 0, 0, 0);
        
        Boxeador box = new Boxeador("Jorge", "Zavala", 18, "Ligero");
        
        box.entrenar();
        fut.entrenar();
        
        EntrenaTodo(box);
    }
    
    public static void imprimir(Persona p)
    {
       System.out.println(p.getNombre() + p.getApellido() + p.getEdad());
    }
    
    public static void EntrenaTodo(Deporte deporte)
    {
       deporte.entrenar();
    };
}
