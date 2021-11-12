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
public class Encomienda {
    private TipoEncomienda tipoEncomienda;
    private int numProductos;
    
    public void Encomienda(Servicio servicio, TipoEncomienda e, int numProductos){
        this.numProductos = numProductos;
        this.tipoEncomienda = e;
    }
    
    /*
    public void SepararConductor(String vehiculo){
        
        if (vehiculo.toLowerCase()=="moto"){
            super.SepararConductor(vehiculo);
        }else{
            System.out.println("Para este servicio solo contamos con conductores de moto");
        }
        
    }
    */

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
