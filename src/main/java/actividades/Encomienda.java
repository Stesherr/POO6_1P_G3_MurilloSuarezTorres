/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Date;
import java.util.Scanner;
import usuario.Conductor;
import usuario.TipoVehiculo;
import usuario.EstadoConductor;
import sistema.Sistema;

/**
 *
 * @author josem
 */
public class Encomienda extends Servicio{
    private TipoEncomienda tipoEncomienda;
    private int numProductos;
    
    public Encomienda(String fecha, Ruta ruta, String hora,TipoPago tp,TipoServicio ts, 
            Conductor conductor, TipoEncomienda e, int numProductos){
        super(fecha,ruta,hora,tp,ts,conductor);
        this.numProductos = numProductos;
        this.tipoEncomienda = e;
    }
    
    public double CalcularPago(){
        return super.CalcularPago();
    }
    
    public void generarEncomienda(){
        
        Scanner scann = new Scanner(System.in);
        System.out.println("Desea confirmar el servicio de Encomienda con un total a pagar de: "+this.CalcularPago()+" ? (Si/No)");
        String answer = scann.nextLine().toLowerCase();
        if (answer=="si"){
            this.SepararConductor(this.getConductor().getVehiculo().getTipo());
        }else{
            //retorna al menu
        }
    }
    
    
    @Override
    public void SepararConductor(TipoVehiculo opcion){
        
        TipoVehiculo vehiculo= TipoVehiculo.MOTO;
        EstadoConductor estado= EstadoConductor.DISPONIBLE;
        for (int i = 0; i < Sistema.getConductores().size(); i++) {
            
//            if ((Sistema.getConductores().get(i).getEstado()==estado)&&(Sistema.getConductores().get(i).getVehiculo()==vehiculo)){
//                this.conductor = Sistema.getConductores().get(i);
//                Sistema.getConductores().get(i).setEstado(EstadoConductor.OCUPADO);
//                break;
//            }
            
        }
        
    }

    public TipoEncomienda getTipoEncomienda() {
        return tipoEncomienda;
    }

    public void setTipoEncomienda(TipoEncomienda tipoEncomienda) {
        this.tipoEncomienda = tipoEncomienda;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }
    
    
}
