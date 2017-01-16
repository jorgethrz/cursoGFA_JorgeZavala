/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author aj.zavala
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombreComplteo )
    {
      this.nombre = nombreComplteo.split(" ")[0];
      this.apellido = nombreComplteo.split(" ")[1];
      this.edad=0;
    }
    
    public Persona(String nombre, String apellido, int edad )
    {
       this.nombre=nombre;
       this.apellido = apellido;
       this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hablar()
    {
        System.out.println("persona.Persona.hablar()");
    }
    
    public void comer()
    {
    System.out.println("persona.Persona.comer()");
    }
    
    
    
    
}
