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
public class Moto extends Vehiculo {
     private boolean frenosDeDisco;
    
    public Moto(int id,int numeroLlantas, int capacidadGasolina,boolean frenosDeDisco ) {
        super(id,numeroLlantas, capacidadGasolina);
        this.frenosDeDisco = frenosDeDisco;
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelera Moto");
    }

    @Override
    public void Detener() {
        System.out.println("Detener Moto");
    }
    
   public void derrapar()
   {
       System.out.println("Derrapa moto");
   }
    
    public void mostrarInformacion()
    {
         System.out.println("MOTO");
        System.out.print(" FrenosDisco: " + this.frenosDeDisco);
        System.out.print(" ID: " + this.getId());
        System.out.print(" NumeroLLantas: " + this.getNumeroLlantas());
        System.out.print(" CapacidadGasolina: " + this.getcapacidadGasolina());
        System.out.println("");
    }
}
