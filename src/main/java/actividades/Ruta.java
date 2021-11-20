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
public class Ruta {
    private String pllegada;
    private String psalida;
    
    public Ruta(String pllegada, String psalida){
        this.pllegada = pllegada;
        this.psalida = psalida;
    }

    public String getPllegada() {
        return pllegada;
    }

    public void setPllegada(String pllegada) {
        this.pllegada = pllegada;
    }

    public String getPsalida() {
        return psalida;
    }

    public void setPsalida(String psalida) {
        this.psalida = psalida;
    }
    
    
}
