/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comida;

import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class Pedido {
    private int codigo;
    private String nombre;
    private ArrayList<Plato> eleccion;
    
    public void Pedido(int codigo, String nombre, ArrayList<Plato> eleccion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.eleccion = eleccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Plato> getEleccion() {
        return eleccion;
    }

    public void setEleccion(ArrayList<Plato> eleccion) {
        this.eleccion = eleccion;
    }
    
    
}
