/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Date;
import usuario.Conductor;

/**
 *
 * @author josem
 */
public class Taxi extends Servicio{
    private int numPersonas;
    
    public Taxi(int id, Date fecha, Ruta ruta, String hora, Conductor conductor, int numPersonas){
        super(id,fecha,ruta,hora,conductor);
        this.numPersonas = numPersonas;
    }
    
    /*
    public void SepararConductor(String vehiculo){
        
        if (vehiculo.toLowerCase()=="auto"){
            super.SepararConductor(vehiculo);
        }else{
            System.out.println("Para este servicio solo contamos con conductores de auto");
        }
        
    }
    */

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    
}
