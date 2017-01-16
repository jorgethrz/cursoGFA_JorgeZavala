/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author aj.zavala
 */
abstract class Empleado extends persona.Persona{
    private int cveEmpleado;
    private float salario;
    
    public Empleado(String nombre,String apellido,int edad,int cveEmpleado,float salario)
    {
        super(nombre,apellido,edad);
        this.cveEmpleado = cveEmpleado;
        this.salario = salario;
        trabajar();
    }
   
   public abstract void trabajar();
   
   public abstract void transporteTorta();
}
