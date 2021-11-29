/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;
import usuario.Conductor;
import usuario.TipoVehiculo;
import usuario.EstadoConductor;
import sistema.Sistema;


/**
 *
 * @author josem
 */
public class Taxi extends Servicio{
    private int numPersonas;
    
    public Taxi(String fecha, Ruta ruta, String hora,TipoPago tp,TipoVehiculo tv, EstadoConductor ec,TipoServicio ts, Conductor conductor, int numPersonas){
        super(fecha,ruta,hora,tp,tv,ec,ts,conductor);
        this.numPersonas = numPersonas;
    }
    
    public double CalcularPago(){
        return super.CalcularPago();
    }
    
    @Override
    public void SepararConductor(TipoVehiculo opcion){
        
        TipoVehiculo vehiculo= TipoVehiculo.AUTO;
        EstadoConductor estado= EstadoConductor.DISPONIBLE;
        for (int i = 0; i < Sistema.getConductores().size(); i++) {
            
//            if ((Sistema.getConductores().get(i).getEstado()==estado)&&(Sistema.getConductores().get(i).getVehiculo()==vehiculo)){
//                this.conductor = Sistema.getConductores().get(i);
//                Sistema.getConductores().get(i).setEstado(EstadoConductor.OCUPADO);
//                break;
//            }
            
        }
        
    }
    
    public void generarTaxi(){
        
        Scanner scann = new Scanner(System.in);
        System.out.println("Desea confirmar el servicio de Delivery con un total a pagar de: "+this.CalcularPago()+" ? (Si/No)");
        String answer = scann.nextLine().toLowerCase();
        if (answer=="si"){
            this.SepararConductor(tv);
        }else{
            //retorna al menu
        }
    }
    

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    
}
