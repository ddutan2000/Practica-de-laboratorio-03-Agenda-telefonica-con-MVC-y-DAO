/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.*;
import ec.edu.ups.dao.*;
import ec.edu.ups.idao.*;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.*;
import java.util.Scanner;
/**
 *
 * @author Dutan2000
 */
public class Test {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        
        //vista
        VistaUsuario vistaU= new VistaUsuario();
        VistaTelefono vistaT=new VistaTelefono();
        
        //DAO
        UsuarioDAO usuarioDAO =new UsuarioDAO();
        TelefonoDao telefonoDAO=new TelefonoDao();
        
        //controlador
        ControladorUsuario controladorUsuario= new ControladorUsuario(vistaU, usuarioDAO, vistaT, telefonoDAO);
        ControladorTelefono controladorTelefono=new ControladorTelefono(vistaT, telefonoDAO);
        boolean salir= false;
        int opcion;
        
        //menu
        while(!salir){
            System.out.println("Bienvenido al programa de Denys");
            System.out.println("1.Registrarse \n2.Ya tengo cuenta\n3.Salir");
            try {
                System.out.println("Eliga una opcion");
                opcion=input.nextInt();
                
                switch(opcion){
                    case 1:
                        int opcion1;
                        boolean salir1=false;
                        //registrar un usuario
                        controladorUsuario.registrar();
                        //menu secudnario
                        while(!salir){
                        System.out.println("Que desea hacer");
                        
                        }
                    case
                } 
                
            } catch (Exception e) {
            }
        }
        
}
