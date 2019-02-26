/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author Helder Castrillon
 */
public class Carro {
    
   private String placa;
   private String marca;
   private String propietario;
   private String fechaIngreso;
   private int horaEntrada;
   private int horaSalida;
   private int ubicacion;

    public Carro(String placa, String marca, String propietario, String fechaIngreso, int horaEntrada, int horaSalida, int ubicacion) {
        this.placa = placa;
        this.marca = marca;
        this.propietario = propietario;
        this.fechaIngreso = fechaIngreso;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.ubicacion = ubicacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
   

   
    
}
