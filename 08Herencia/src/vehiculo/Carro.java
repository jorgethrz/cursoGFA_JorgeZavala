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
public class Carro extends Vehiculo{
    int numeroPuertas;

    public Carro(int id,int numeroPuertas, int numeroLlantas, int capacidadGasolina) {
        super(id,numeroLlantas, capacidadGasolina);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelera Carro");
    }

    @Override
    public void Detener() {
        System.out.println("Detener Carro");
    }
    
    public void AbreDespachadorGasolina()
    {
        System.out.println("Abre para llenar gasolina");
    }
    
      public void mostrarInformacion()
    {
       System.out.println("CARRO");
        System.out.print(" NumeroPuertas: " + this.numeroPuertas);
        System.out.print(" ID: " + this.getId());
        System.out.print(" NumeroLLantas: " + this.getNumeroLlantas());
        System.out.print(" CapacidadGasolina: " + this.getcapacidadGasolina());
        System.out.println("");
    }
    
}
