/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;
import java.util.Date;
import usuario.Conductor;
import usuario.TipoVehiculo;

/**
 *
 * @author josem
 */
public class Servicio {
    protected int id;
    protected Date fecha;
    protected Ruta ruta;
    protected String hora;
    protected Conductor conductor;
    
    public void Servicio(int id, Date fecha, Ruta ruta, String hora, Conductor conductor){
        this.conductor = conductor;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.ruta = ruta;
    }
    
    public double CalcularPago(){
        double resultado = 0.0;
        //calcualr el pago
        return resultado;
    }
    
    public double CalcularPago(String tarjeta){
        double resultado = 0.0;
        //calcualr el pago
        return resultado;
    }
    
    protected void SepararConductor(TipoVehiculo opcion){
        
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
