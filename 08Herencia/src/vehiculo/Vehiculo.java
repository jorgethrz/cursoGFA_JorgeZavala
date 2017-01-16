/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author aj.zavala
 */
public abstract class Vehiculo {
    private int id;
    private int numeroLlantas;
    private int capacidadGasolina;

    public Vehiculo(int id,int numeroLlantas, int capacidadGasolina) {
        this.numeroLlantas = numeroLlantas;
        this.capacidadGasolina = capacidadGasolina;
        this.id = id;
    }
    
    public abstract void Acelerar();
    
    public abstract void Detener();
    
    public int getId()
    {
      return id;
    }
    
    public int getNumeroLlantas()
    {
      return numeroLlantas;
    }
    
    public int getcapacidadGasolina()
    {
      return capacidadGasolina;
    }
    
    //public void Imprimir() throws Exception
    //{
        
    //};
    
    public abstract void mostrarInformacion();
    
}
