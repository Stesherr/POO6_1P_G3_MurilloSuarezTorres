/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;
import usuario.Cliente;

/**
 *
 * @author josem
 */
public class Pago {
    private Cliente cliente;
    private Servicio servicio;
    private double totalPagar;

    public Pago(Cliente cliente, Servicio servicio, double totalPagar) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.totalPagar = totalPagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
    
}
