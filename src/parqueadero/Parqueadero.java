/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Helder Castrillon
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Carro> Carros = new ArrayList<>(); 
        Scanner lea = new Scanner(System.in);
        int opcionCrear=1; 
        int opcionMenu=1;

        System.out.println("Bienvenidos al sistema de parqueadero");
        System.out.println("Creado por Helder Castrillón");
                  
        
        do{
           
            System.out.println("1. Crear vehiculo");
            System.out.println("2. Ver lista de vehiculos");
            System.out.println("0. Salir");
            opcionMenu=lea.nextInt(); 
            switch(opcionMenu){
                case 1:
                     Carro automovil= crearCarro();
                     Carros.add(automovil);
                     break;
                case 2:
                   imprimirCarros(Carros); 
                   break;
                
                }
                     
            }while(opcionMenu!=0);
        
        
    }
    
    public static Carro crearCarro(){
        Scanner lea = new Scanner(System.in);
         System.out.println("Digite el nombre del propietario: ");
            String propietario = lea.next();
           System.out.println("Digite la placa del automovil:  ");
            String placa = lea.next();
           System.out.println("Digite la marca del automovil: ");       
            String marca = lea.next();
           System.out.println("Digite la fecha de ingreso: ");       
            String fechaIngreso = lea.next();
           System.out.println("Digite la hora de entrada: ");       
            int horaEntrada = lea.nextInt();
           System.out.println("Digite la hora de salida: ");       
            int horaSalida = lea.nextInt();
           System.out.println("Digite la ubicacion de parqueo: ");       
            int ubicacion = lea.nextInt();
        
        Carro automovil = new Carro(placa,marca,propietario,fechaIngreso,horaEntrada,horaSalida,ubicacion);
        
        return automovil;
    
    }
    
    public static void imprimirCarros(List<Carro> Carros){
          for(int i=0; i<Carros.size();i++){
                System.out.println("Nombre del propietario "+ Carros.get(i).getPropietario());
                System.out.println("El numero de placa  "+ Carros.get(i).getPlaca());
                System.out.println("La marca del vehiculo "+ Carros.get(i).getMarca());
                System.out.println("Fecha de ingreso  "+ Carros.get(i).getFechaIngreso());
                System.out.println("Hora de entrada  "+ Carros.get(i).getHoraEntrada());
                System.out.println("Hora de salida  "+ Carros.get(i).getHoraSalida());
                System.out.println("Ubicacion  "+ Carros.get(i).getUbicacion());
          }
    
    }
    
}
