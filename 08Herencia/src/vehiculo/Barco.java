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
public class Barco extends Vehiculo{
    private int numeroAnclas;

    public Barco(int numeroAnclas, int id, int numeroLlantas, int capacidadGasolina) {
        super(id, numeroLlantas, capacidadGasolina);
        this.numeroAnclas = numeroAnclas;
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelerar barco");
    }

    @Override
    public void Detener() {
        System.out.println("Detener barco");
    }
    
    public void Anclar()
    {
        System.out.println("Anclar barco");
    }
    
      public void mostrarInformacion()
    {
         System.out.println("BARCO");
        System.out.print(" Anclas: " + this.numeroAnclas);
        System.out.print(" ID: " + this.getId());
        System.out.print(" NumeroLLantas: " + this.getNumeroLlantas());
        System.out.print(" CapacidadGasolina: " + this.getcapacidadGasolina());
        System.out.println("");
    }
}
