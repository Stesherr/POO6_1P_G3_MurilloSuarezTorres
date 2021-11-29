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
public class Cliente extends Usuario{
    private int edad;
    private String numTarjCredit; 
    
    public Cliente (String numCedula,String nombre,String apellido,String user,String pass,String celular, int edad, String numTarjCredit){
        super(numCedula, nombre, apellido,user, pass, celular);
        this.edad = edad;
        this.numTarjCredit = numTarjCredit;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumTarjCredit() {
        return numTarjCredit;
    }

    public void setNumTarjCredit(String numTarjCredit) {
        this.numTarjCredit = numTarjCredit;
    }
    
    @Override
    public String toString(){
        return this.numCedula + "," + this.edad + "," + this.numTarjCredit;
    }
    
    @Override
    public void consultarServicio(){
        
    }
    
}
