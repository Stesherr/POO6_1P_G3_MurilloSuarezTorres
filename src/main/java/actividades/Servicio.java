/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;
import java.util.Date;
import usuario.Conductor;
import usuario.TipoVehiculo;
import usuario.EstadoConductor;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author josem
 */
public abstract class Servicio {
    protected int id;
    protected Date fecha;
    protected Ruta ruta;
    protected String hora;
    protected Conductor conductor;
    protected TipoPago tp;
    protected TipoVehiculo tv;
    protected EstadoConductor ec;
    protected TipoServicio ts;
    
    public Servicio(int id, Date fecha, Ruta ruta, String hora,TipoPago tp,TipoVehiculo tv,EstadoConductor ec,TipoServicio ts, Conductor conductor){
        this.conductor = conductor;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.ruta = ruta;
        this.tp = tp;
        this.tv = tv;
        this.ec = ec;
        this.ts = ts;
    }
    
    
    public double CalcularPago(){
        double resultado = 0.0;
        //calcualr el pago
        double random= Math.random()*50.0+1.0;
        switch(tp){
            case EFECTIVO:
                resultado = random;
                break;
            case TARJETA:
                resultado = random+(random*0.10);
                break;
        }
        return resultado;
    }
    
    
    public void SepararConductor(TipoVehiculo opcion){
        
    }
    
    public void generarServicio(TipoServicio ts){
        Scanner scan= new Scanner(System.in);
        switch(ts){
            case TAXI:
                System.out.println("");
                
               // Servicio tax= new Taxi();
                break;
            case ENCOMIENDA:
                //Encomienda.generarEncomienda();
                break;
            case DELIVERY:
                //this.
                break;
        }
         
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
}
