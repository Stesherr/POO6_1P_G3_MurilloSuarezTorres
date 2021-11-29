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
import java.util.Scanner;
import sistema.Sistema;
import usuario.Conductor;
import usuario.TipoVehiculo;
import usuario.EstadoConductor;

/**
 *
 * @author josem
 */
public class Delivery extends Servicio{
    private String datos;
    private Pedido pedido;
    
    public Delivery(String fecha, Ruta ruta, String hora,TipoPago tp,TipoServicio ts, Conductor conductor, String datos, Pedido pedido){
        super(fecha,ruta,hora,tp,ts,conductor);
        this.datos = datos;
        this.pedido = pedido;
    }
    
    public void RealizarPedido(){
        
    }
    
    public void generarDelivery(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Desea confirmar el servicio de Delivery con un total a pagar de: "+this.CalcularPago(pedido)+" ? (Si/No)");
        String answer = scann.nextLine().toLowerCase();
        if (answer=="si"){
            this.SepararConductor(this.getConductor().getVehiculo().getTipo());
        }else{
            //retorna al menu
        }
    }
    
    public double CalcularPago(Pedido o){
        ArrayList<Plato> lista = o.getEleccion();
        double resultado = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + lista.get(i).getPrecio();
        }
        double random= Math.random()*50.0+1.0;
        switch(tp){
            case EFECTIVO:
                resultado = random+resultado;
                break;
            case TARJETA:
                resultado = random+resultado+((random+resultado)*0.10);
                break;
        }
        return resultado;
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
