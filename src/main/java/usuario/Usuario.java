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
    protected String numCedula;
    protected String nombre;
    protected String apellido;
    protected String user;
    protected String pass;
    protected String celular;
    
    public Usuario(String numCedula, String nombre, String apellido, String user, String pass, String celular){
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.pass = pass;
        this.celular = celular;
    }
    
    public String getNumCedula(){
        return numCedula;
    }
    
    public void setNumCedula(String numCedula){
        this.numCedula = numCedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }
}
