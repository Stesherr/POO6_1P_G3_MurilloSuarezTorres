/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;
import usuario.Conductor;
import usuario.Cliente;
import usuario.TipoVehiculo;
import usuario.EstadoConductor;
import sistema.Sistema;
import manejoArchivos.manejoArchivos;


/**
 *
 * @author josem
 */
public class Taxi extends Servicio{
    private int numPersonas;
    
    public Taxi(String fecha, Ruta ruta, String hora,TipoPago tp,TipoServicio ts, Conductor conductor, int numPersonas){
        super(fecha,ruta,hora,tp,ts,conductor);
        this.numPersonas = numPersonas;
    }
    
    @Override
    public double CalcularPago(){
        return super.CalcularPago();
    }
    
    @Override
    public void SepararConductor(TipoVehiculo opcion){
        EstadoConductor estado= EstadoConductor.DISPONIBLE;
        for (Conductor cond:Sistema.getConductores()){
            if(cond.getEstado().equals(estado) && cond.getVehiculo().getTipo().equals(opcion)){
                this.setConductor(cond);
                this.getConductor().setEstado(EstadoConductor.OCUPADO);
                break;
            }
        }
    }
    

    public void generarServicio(TipoServicio servicio, Cliente cliente){
        double total = this.CalcularPago();
        this.SepararConductor(this.getConductor().getVehiculo().getTipo());
        String linea = this.id + "," + cliente.getNombre()+ " " + cliente.getApellido() + "," 
                + this.conductor.getNombre() + " " + this.conductor.getApellido() + "," 
                + this.ruta.getPsalida() + "," + this.ruta.getPllegada() + "," + this.fecha + "," 
                + this.hora + "," + this.numPersonas + "," + this.tp + "," + total;
        manejoArchivos.EscribirArchivo("viajes.txt", linea);

    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    
}
