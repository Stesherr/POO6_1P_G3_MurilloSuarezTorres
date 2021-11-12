/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

/**
 *
 * @author josem
 */
public class Taxi {
    private int numPersonas;
    
    public void Taxi(Servicio servicio, int numPersonas){
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
