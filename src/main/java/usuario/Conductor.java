/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import static usuario.EstadoConductor.OCUPADO;

/**
 *
 * @author Stefano
 */
public class Conductor {
    private int numLicencia;
    private EstadoConductor estado;
    private TipoVehiculo vehiculo;
    
    public Conductor(Usuario usuario, int numLicencia, EstadoConductor estado,TipoVehiculo vehiculo){
        super();
        this.estado = estado;
        this.numLicencia = numLicencia;
        this.vehiculo = vehiculo;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public EstadoConductor getEstado() {
        return estado;
    }

    public void setEstado(EstadoConductor estado) {
        this.estado = estado;
    }

    public TipoVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(TipoVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void consultarServicio(){
        if (this.estado==OCUPADO) {
            System.out.println("Usted se encuentra prestando el servicio: ");
        } else {
            System.out.println("Usted no se encuentra prestando ningún servicio");
        }
        
    }
}
