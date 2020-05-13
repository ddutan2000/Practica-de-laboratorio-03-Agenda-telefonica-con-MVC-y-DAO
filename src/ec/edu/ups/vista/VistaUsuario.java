/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.util.Scanner;
import java.util.List;
import ec.edu.ups.modelo.Usuario;
/**
 *
 * @author Dutan2000
 */
public class VistaUsuario {
    //atributos
    private Scanner entrada; 
    
    //constructor 

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }
    
    
    //metodo registrar
    public Usuario registarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese los datos del Usuario");
        System.out.println("Cedula: ");
        String cedula=entrada.next();
        System.out.print("Nombre: ");
        String nombre= entrada.next();
        System.out.print("Apellido: ");
        String apellido =entrada.next();
        System.out.print("Correo: ");
        String correo=entrada.next();
        System.out.println("Contraseña: ");
        String contrasenia=entrada.next();
        
        return new Usuario(cedula, nombre, apellido, correo, contrasenia);
    }
    
    
    //metodod actualizar
    public Usuario modificarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingresa la cedula del usuario que desea modificar");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos datos del usuario (nombre, apellido, correo y contrseña)");
        String nombre = entrada.next();
        String apellido = entrada.next();
        String correo=entrada.next();
        String contrsenia=entrada.next();
        return new Usuario(cedula, nombre, apellido, correo, contrsenia);
    } 
    
    //metodo eliminar 
    public Usuario eliminarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese la cedula del usuario que desea eliminar");
        String cedula =entrada.next();
        
        return new Usuario(cedula, null, null, null, null);
    }
    
    //metodo buscar telefono
    public String buscarUsuario(){
        entrada=new Scanner (System.in);
        System.out.println("Ingrese la cedula del usuario que desea buscar");
        String cedula =entrada.next();
        
        return cedula;
    } 
    
    //metodo listar telefonos
    public void verUsuario(Usuario usuario){
        System.out.println("Datos del usuario: "+ usuario);
    }
    
    public void verTelefonos(List<Usuario> usuarios){
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del usuario: "+ usuario);
        }
    }
}

