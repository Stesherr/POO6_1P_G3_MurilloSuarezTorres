/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import usuario.Usuario;
import usuario.Conductor;
import usuario.Cliente;
import manejoArchivos.manejoArchivos;
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
        System.out.println("\n/***************MENU***************/");
        System.out.println("/*                                */");
        System.out.println("/**********************************/");
        System.out.println("1. Solicitar servicio de taxi");
        System.out.println("2. Solicitar comida a domicilio");
        System.out.println("3. Solicitar entrega encomienda");
        System.out.println("4. Consultar servicio\n");
        System.out.println("Elija una opcion:");
        int opcion = sc.nextInt();
        sc.nextLine();  
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
  
    public static void menuConductor(){
        System.out.println("\n/**********MENU CONDUCTOR**********/");
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
    
    public static void iniciarSesion(String usuario,String password){
        ArrayList<String> usuariosArchivo = manejoArchivos.LeeFichero("usuarios.txt");
        ArrayList<String> datosUsuario;
        
        for(int i=1; i<usuariosArchivo.size(); i++){
            datosUsuario = new ArrayList(Arrays.asList(usuariosArchivo.get(i).split(",")));
            String tipoUsuario = datosUsuario.get(6);
            if(tipoUsuario.equals("C")){
                Cliente cliente = new Cliente(datosUsuario.get(0),datosUsuario.get(1),datosUsuario.get(2)
                        , datosUsuario.get(3), datosUsuario.get(4),datosUsuario.get(5),0,null);
                usuarios.add(cliente);
            }
            else if(tipoUsuario.equals("R")){
                Conductor conductor = new Conductor(datosUsuario.get(0), datosUsuario.get(1), 
                        datosUsuario.get(2), datosUsuario.get(3), datosUsuario.get(4),datosUsuario.get(5),0,null,null);
                usuarios.add(conductor);
            } 
        }
        
        
        for(Usuario user:usuarios){
            if(user.getUser().equals(usuario)&&user.getPass().equals(password)){
                if(user instanceof Cliente){
                    Cliente cl = (Cliente)user;
                    if(cl.getEdad()==0 && cl.getNumTarjCredit() == null){
                        System.out.println("Ingrese su edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        cl.setEdad(edad);
                        System.out.println("Ingrese su numero de tarjeta: ");
                        String numTarjeta = sc.nextLine();
                        cl.setNumTarjCredit(numTarjeta);
                        System.out.println("Se han añadido sus datos correctamente");
                        manejoArchivos.EscribirArchivo("clientes.txt", cl.toString());
                        menuCliente();
                        
                    }
                    else{
                        manejoArchivos.EscribirArchivo("clientes.txt", cl.toString());
                        menuCliente();
                    }                    
                }
                else if(user instanceof Conductor){
                    Conductor conduc = (Conductor)user;
                    
                    menuConductor();
                }
            }
        }
    }
    
    public static void main(String[] args){
        System.out.println("+++++++++++++++++++++++++++++++++++++\n");
        System.out.println("        BIENVENIDO AL SISTEMA\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++\n");        
        System.out.println("USUARIO: ");
        String usuario = sc.nextLine();
        System.out.println("CONTRASEÑA: ");
        String password = sc.nextLine();
        iniciarSesion(usuario,password);
    
    }
    
    
}
