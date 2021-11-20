/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;
import comida.Pedido;
import comida.Plato;
import java.util.ArrayList;
import java.util.Date;
import usuario.Conductor;
import usuario.TipoVehiculo;

/**
 *
 * @author josem
 */
public class Delivery extends Servicio{
    private String datos;
    private Pedido pedido;
    
    public Delivery(int id, Date fecha, Ruta ruta, String hora, Conductor conductor, String datos, Pedido pedido){
        super(id,fecha,ruta,hora,conductor);
        this.datos = datos;
        this.pedido = pedido;
    }
    
    public void RealizarPedido(){
        
    }
    
    public double CalculaarPago(Pedido o){
        ArrayList<Plato> lista = o.getEleccion();
        double resultado = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + lista.get(i).getPrecio();
        }
        return resultado;
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

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
} 
