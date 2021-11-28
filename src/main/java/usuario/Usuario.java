/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author Stefano
 */
public class Usuario {
    protected int codUsuario;
    protected String numCedula;
    protected String nombre;
    protected String apellido;
    protected String user;
    protected String contraseña;
    protected String celular;
    
    public Usuario(String numCedula, String nombre, String user, String contraseña, String celular){
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.contraseña = contraseña;
        this.celular = celular;
        
    }
}
