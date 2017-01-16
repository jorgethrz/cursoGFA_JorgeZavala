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
public class Autobus extends Vehiculo{

    private int numeroAsientos;
    public Autobus(int id,int numeroLlantas, int capacidadGasolina,int numeroAsientos) {
        super(id,numeroLlantas, capacidadGasolina);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelera Autobus");
    }

    @Override
    public void Detener() {
        System.out.println("Detener Autobus");
    }
    
    public void SuberPasajeros()
    {
        System.out.println("Sube pasajeros");
    }
    
    public void mostrarInformacion()
    {
      System.out.println("AUTOBUS");
        System.out.print(" Asientos: " +  this.numeroAsientos);
        System.out.print(" Id: " + this.getId());
        System.out.print(" NumeroLlantas: " + this.getNumeroLlantas());
        System.out.print(" CapacidadGasolina: " + this.getcapacidadGasolina());
        System.out.println("");
    }
}
