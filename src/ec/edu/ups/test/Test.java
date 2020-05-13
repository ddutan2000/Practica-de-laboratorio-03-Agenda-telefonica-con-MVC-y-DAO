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
import java.util.InputMismatchException;

/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //vista
        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();

        //DAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDao telefonoDAO = new TelefonoDao();

        //controlador
        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaU, usuarioDAO, vistaT, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);
        boolean salir = false;
        int opcion;

        //menu
        while (!salir) {
            System.out.println("Bienvenido al programa de Denys");
            System.out.println("1.Registrarse \n2.Ya tengo cuenta\n3.Salir");
            try {
                System.out.println("Eliga una opcion");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        int opcion1;
                        boolean salir1 = false;
                        //registrar un usuario
                        controladorUsuario.registrar();
                        //menu secudnario
                        while (!salir1) {
                            System.out.println("Que quiere hacer");
                            System.out.println("1.Registrar Telefono\n2.Modificar Telefono"
                                    + "\n3.Eliminar telefono\n4.Buscar Telefono\n5.Listar telefonos\n6.Salir");
                            try {
                                System.out.println("Elija una opcion");
                                opcion1 = input.nextInt();

                                switch (opcion1) {
                                    case 1:
                                        controladorTelefono.registrar();
                                        
                                        break;
                                    case 2:
                                        controladorTelefono.actulizar();
                                        break;
                                    case 3:
                                        controladorTelefono.eliminar();
                                        break;
                                    case 4:
                                        controladorTelefono.verTelefono();
                                        break;
                                    case 5:
                                        controladorTelefono.verTelefonos();
                                        break;
                                    case 6:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo numeros entre 1 y 6");

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes ingresar un numero");
                                input.nextInt();
                            }

                        }
                    case 2:
                        
                        System.out.println("ingrese su correo electronico:");
                        String correo = input.next();
                        if (usuarioDAO.findAll().contains(correo)) {
                            System.out.println("ingrese contrseña");
                            String contrasenia = input.next();
                            //falta hacer if () {
                                int opcion2;
                                boolean salir2 = false;
                                //registrar un usuario
                                controladorUsuario.registrar();
                                //menu secudnario
                                while (!salir2) {
                                    System.out.println("Que quiere hacer");
                                    System.out.println("1.Registrar Telefono\n2.Modificar Telefono"
                                            + "\n3.Eliminar telefono\n4.Buscar Telefono\n5.Listar telefonos\n6.Salir");
                                    try {
                                        System.out.println("Elija una opcion");
                                        opcion1 = input.nextInt();

                                        switch (opcion1) {
                                            case 1:
                                                controladorTelefono.registrar();
                                                break;
                                            case 2:
                                                controladorTelefono.actulizar();
                                                break;
                                            case 3:
                                                controladorTelefono.eliminar();
                                                break;
                                            case 4:
                                                controladorTelefono.verTelefono();
                                                break;
                                            case 5:
                                                controladorTelefono.verTelefonos();
                                                break;
                                            case 6:
                                                salir2 = true;
                                                break;
                                            default:
                                                System.out.println("Solo numeros entre 1 y 6");

                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debes ingresar un numero");
                                        input.nextInt();
                                    }
                                }
                            }
                        } else {
                            System.out.println("correo electronico no exsiste");
                        }

                }

            } catch (InputMismatchException e) {
            }
        }
    }
}
