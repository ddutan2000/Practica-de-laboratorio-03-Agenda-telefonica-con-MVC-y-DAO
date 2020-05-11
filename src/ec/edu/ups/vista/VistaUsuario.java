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
    public Usuario registrarusuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese los datos del usuario");
        System.out.println("Cedula: ");
        String cedula=entrada.next();
        System.out.print("Nombre: ");
        String nombre= entrada.next();
        System.out.print("Apellido: ");
        String apellido =entrada.next();
        System.out.print("Correo: ");
        String correo =entrada.next();
        System.out.print("Contraseña: ");
        String contrasenia=entrada.next();
        
        return new Usuario(cedula, nombre, apellido, correo, contrasenia);
    }
    
    
    //metodod actualizar
    public Usuario modificarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingresa la cedula del usuario que va a actualizar");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos Datos (nombre, apellido, correo, contraseña)");
        String nombre = entrada.next();
        String apellido = entrada.next();
        String correo=entrada.next();
        String contrasenia=entrada.next();
        
        return new Usuario(cedula, nombre, apellido, correo, contrasenia);
    } 
    
    //metodo eliminar 
    public Usuario eliminarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("ingrese la cedula del usuario que va a eliminar");
        String cedula =entrada.next();
        
        return new Usuario(cedula, null, null, null, null);
    }
    
    //metodo buscar telefono
    public String buscarUsuario(){
        entrada=new Scanner (System.in);
        System.out.println("ingrese el codigo de telefono que desea encontrar");
        String cedula =entrada.next();
        
        return cedula;
    } 
    
    //metodo listar telefonos
    public void verUsuario(List<Usuario> usuario){
        for (Usuario usuario1 : usuario) {
            System.out.println("datos del telefono: "+ usuario1);
        }
    }
}

