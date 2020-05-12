/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author Dutan2000
 */
public class Test {
    public static void main(String[] args){
        //scanner
        Scanner input=new Scanner(System.in);
        //vista
        VistaUsuario vista=new VistaUsuario();
        //controlador
        ControladorUsuario controlador =new ControladorUsuario(vista);
        
        //modelo
        boolean salir=true;
        int opcion;
        
        while(!salir){
            System.out.println("Bienvenido");
            System.out.println("Eliga una opcion\n1.Ingresar\n2.Registrarse");
            try {
                System.out.println("Eliga una opcion");
                opcion=input.nextInt();
                
                switch (opcion){
                    case 1: 
                        System.out.println("Ingrese correo electronico: ");
                        String correo=input.next();                      
                        System.out.println("ingrese su contraseña: ");
                        String contresenia=input.next();

                    
                }
            } catch (Exception e) {
            }
{
                
            }
        }
        
        
    }
}
