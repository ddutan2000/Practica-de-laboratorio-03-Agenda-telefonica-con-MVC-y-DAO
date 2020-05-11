/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.modelo.Telefono;
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
    public Usuario registarTelefono(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese los datos del telefono");
        System.out.println("Codigo: ");
        int codigo=entrada.nextInt();
        System.out.print("Numero: ");
        String numero= entrada.next();
        System.out.print("Tipo: ");
        String tipo =entrada.next();
        System.out.print("Operadora: ");
        String operadora=entrada.next();
        Telefono t1 =new Telefono(codigo, numero, tipo, operadora);
        return (Usuario)t1;
    }
    
    
    //metodod actualizar
    public Usuario modificarTelefono(){
        entrada=new Scanner(System.in);
        System.out.println("Ingresa codigo del telefono que desea modificar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos (numero, tipo, operadora)");
        String numero = entrada.next();
        String tipo = entrada.next();
        String operadora=entrada.next();        
        return new (Usuario) Telefono(codigo, numero, tipo, operadora);
    } 
    
    //metodo eliminar 
    public Usuario eliminarTelefono(){
        entrada=new Scanner(System.in);
        System.out.println("ingrese codigo del telefono que desea guardar");
        int codigo =entrada.nextInt();
        
        return new (Usuario)Telefono(codigo, null, null, null)
    }
    
    //metodo buscar telefono
    public int buscarTelefono(){
        entrada=new Scanner (System.in);
        System.out.println("ingrese el codigo de telefono que desea encontrar");
        int codigo =entrada.nextInt();
        
        return codigo;
    } 
    
    //metodo listar telefonos
    public void verTelefono(Usuario usuario){
        System.out.println("Datos del Usuario: "+ usuario);
    }
    
    public void verTelefonos(List<Telefono> telefonos){
        for (Telefono telefono1 : telefonos) {
            System.out.println("datos del telefono: "+ telefono1);
        }
    }
}

