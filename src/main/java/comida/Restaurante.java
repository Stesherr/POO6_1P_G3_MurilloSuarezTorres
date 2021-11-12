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
public class Restaurante {
    private int codigo;
    private String nombre;
    private ArrayList<Plato> menu;
    
    public void Restaurante(int codigo, String nombre, ArrayList<Plato> menu){
        this.codigo = codigo;
        this.nombre = nombre;
        this.menu = menu;
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

    public ArrayList<Plato> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }
    
}
