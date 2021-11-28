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
public class Conductor extends Usuario{
    private int numLicencia;
    private EstadoConductor estado;
    private Vehiculo vehiculo;
    
    public Conductor(String numCedula,String nombre,String apellido, 
            String user,String pass,String celular, int numLicencia, 
            EstadoConductor estado,Vehiculo vehiculo){
        super(numCedula, nombre, apellido, user, pass, celular);
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
    
    public void consultarServicio(){
        if (this.estado==OCUPADO) {
            System.out.println("Usted se encuentra prestando el servicio: ");
        } else {
            System.out.println("Usted no se encuentra prestando ningún servicio");
        }
        
    }
    
    @Override
    public String toString(){
        return this.numCedula + "," + this.numLicencia + "," + this.estado + "," + this.vehiculo.getCodVehiculo();
    }
}
