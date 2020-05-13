/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.util.Scanner;
import java.util.List;
import ec.edu.ups.modelo.Telefono;
/**
 *
 * @author Dutan2000
 */
public class VistaTelefono {

    private Scanner entrada;
    
    public VistaTelefono(){
        entrada=new Scanner(System.in);
    }
    
    public Telefono registrarTelefono(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese los datos del telefono: ");
        System.out.println("Codigo: ");
        int codigo=entrada.nextInt();
        System.out.println("Numero: ");
        String numero=entrada.next();
        System.out.println("Tipo: ");
        String tipo=entrada.next();
        System.out.println("Operadora: ");
        String operadora=entrada.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    public Telefono modificarTelefono(){
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del telefono que quiere modificar");
        int codigo =entrada.nextInt();
        System.out.println("Ingrese los nuevos datos (numero, tipo y operadora)");
        String numero=entrada.next();
        String tipo=entrada.next();
        String operadora=entrada.next();
        
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    public Telefono elimiarTelefono(){
        entrada=new Scanner(System.in);
        System.out.println("ingrese el dogigo del telefono que desea eliminar");
        int codigo = entrada.nextInt();
        return new Telefono(codigo, null, null, null);
    }
    
    public int buscarTelefono(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese el codigo del telefono que desea buscar ");
        int codigo=entrada.nextInt();
        return codigo;
    }
    public void verTelefono(Telefono telefono){
        System.out.println("Datos del telefono: "+ telefono);
    }
    
    public void verTelefonos(List<Telefono> telefonos){
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: "+ telefono);
        }
    }
}
