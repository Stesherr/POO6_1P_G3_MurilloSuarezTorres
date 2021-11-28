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
    private int numTarjCredit;
    
    
    
    public Cliente (String numCedula,String nombre,String apellido,String user,String pass,String celular, int edad, int numTarjCredit){
        super(numCedula, nombre, apellido,user, pass, celular);
        this.edad = edad;
        this.numTarjCredit = numTarjCredit;
    }
    
    //solicitar servicio de taxi

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumTarjCredit() {
        return numTarjCredit;
    }

    public void setNumTarjCredit(int numTarjCredit) {
        this.numTarjCredit = numTarjCredit;
    }
    
    
    
}
