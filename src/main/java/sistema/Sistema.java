/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import java.util.ArrayList;
import java.util.Scanner;
import usuario.Usuario;
import usuario.Conductor;
import usuario.Cliente;
/**
 *
 * @author Stefano
 */
public class Sistema {
    private static ArrayList<Usuario> usuarios = new ArrayList();
    private static ArrayList<Conductor> conductores= new ArrayList();
    private static ArrayList<Cliente> clientes = new ArrayList();
    private static Scanner sc = new Scanner(System.in);
    
    public static void menuCliente(){
        System.out.println("/***************MENU***************/");
        System.out.println("/*                                */");
        System.out.println("/**********************************/");
        System.out.println("1. Solicitar servicio de taxi");
        System.out.println("2. Solicitar comida a domicilio");
        System.out.println("3. Solicitar entrega encomienda");
        System.out.println("4. Consultar servicio\n");
        System.out.println("Elija una opcion:");
        int opcion = sc.nextInt();
        sc.nextLine();  
        Scanner sca = new Scanner(System.in);
        switch(opcion){
            
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
        
        
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Sistema.usuarios = usuarios;
    }

    public static ArrayList<Conductor> getConductores() {
        return conductores;
    }

    public static void setConductores(ArrayList<Conductor> conductores) {
        Sistema.conductores = conductores;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Sistema.clientes = clientes;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Sistema.sc = sc;
    }
    
    
    
    public static void menuConductor(){
        System.out.println("/**********MENU CONDUCTOR**********/");
        System.out.println("/*                                */");
        System.out.println("/**********************************/");
        System.out.println("1. Consultar Serivicio Asignado");
        int opcion = sc.nextInt();
        sc.nextLine();        
        switch(opcion){
            case 1:
                
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
    
    public static boolean iniciarSesion(String usuario,String password){
        return false;
    }
    
    public static void main(String[] args){
        System.out.println("+++++++++++++++++++++++++++++++++++++\n");
        System.out.println("        BIENVENIDO AL SISTEMA\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++\n");        
        System.out.println("USUARIO: ");
        String usuario = sc.nextLine();
        System.out.println("CONTRASEÑA: ");
        String password = sc.nextLine();
    }
    
    
}
