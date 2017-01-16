/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import vehiculo.Autobus;
import vehiculo.Barco;
import vehiculo.Carro;
import vehiculo.Moto;
import vehiculo.Vehiculo;

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
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
           
        int opcion =0;
        int id=1;
        
        while(opcion != 8)
        {
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("1.-Registrar nuevo vehiculo(Autobus)");
            System.out.println("2.-Registrar nuevo vehiculo(Barco)");
            System.out.println("3.-Registrar nuevo vehiculo(Carro)");
            System.out.println("4.-Registrar nuevo vehiculo(Moto)");
            System.out.println("5.-Eliminar vehiculo ");
            System.out.println("6.-Buscar por id");
            System.out.println("7.-Consultar todo");
            System.out.println("8.-Salir");
            System.out.println("--------");
            System.out.print(":");

            Scanner s =new Scanner(System.in);
            opcion= s.nextInt();
            

            if(opcion >= 1 && opcion <= 4)
            {
              vehiculos.add(RegistrarVehiculo(id++, opcion));
            }
            else if(opcion == 5)
            {
                System.out.println("Id a eliminar: ");
                int idEliminar = s.nextInt();
                if(Eliminar(idEliminar, vehiculos))
                    System.out.println("Eliminado");
                else
                    System.out.println("No Eliminado");
            }
            else if(opcion == 6)
            {
                System.out.println("Id a buscar: ");
              int idBuscar = s.nextInt();
              Vehiculo v = Buscar(idBuscar, vehiculos);
              v.mostrarInformacion();
            }
            else if(opcion == 7)
            {
              for(Vehiculo v:vehiculos)
                v.mostrarInformacion();
            }
            else 
            {
              break;
            }
                
        }
               
    }
    
    public static Vehiculo RegistrarVehiculo(int id,int tipoVehiculo)
    {
       Scanner s = new Scanner(System.in);
       
       //numero de llantas
       System.out.println("NueroLlantas");
       int cantidadLlantas = s.nextInt();
       //capacidad de gasolina
       System.out.println("CapacidadGasolina");
       int capacidadGasolina = s.nextInt();
       
        switch (tipoVehiculo) {
            case 1:
                //numero asientos
                System.out.println("NueroAsientos");
                int numeroAsientos = s.nextInt();
                Autobus autobus = new Autobus(id,cantidadLlantas,capacidadGasolina,numeroAsientos);
                return autobus;
            case 2:
                //numero asientos
                System.out.println("NueroAnclas");
                int numeroAnclas = s.nextInt();
                Barco barco = new Barco(numeroAnclas,id,cantidadLlantas,capacidadGasolina);
                return barco;
            case 3:
                System.out.println("NueroPuertas");
                int numeroPuertas = s.nextInt();
                
                Carro carro = new Carro(id,numeroPuertas,cantidadLlantas,capacidadGasolina);
                return carro;
            case 4:
                //frenos de discos
                System.out.println("Frenos de disco (S)(N)");
                String frenosDeDisco = s.next();
                Moto moto = new Moto(id,cantidadLlantas,capacidadGasolina, frenosDeDisco.equals("S"));
                return moto;
            default:
                break;
        }
       return null;
    }
    
    
    public static boolean Eliminar(int id, List<Vehiculo> vehiculos)
    {
        for(int i=0;i<vehiculos.size();i++)
        {
          if(vehiculos.get(i).getId() == id)
          {
              vehiculos.remove(i);
              return true;
          }
        }
        
        return false;
    }
    
    public static Vehiculo Buscar(int id, List<Vehiculo> vehiculos)
    {
        for(int i=0;i<vehiculos.size();i++)
        {
          if(vehiculos.get(i).getId() == id)
          {
              return vehiculos.get(i);
          }
        }
        
        return null;
    }
}
