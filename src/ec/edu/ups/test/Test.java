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
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //modelo
        Usuario u = new Usuario();

        //vista
        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();

        //DAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDao telefonoDAO = new TelefonoDao();

        //controlador
        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaU, usuarioDAO, vistaT, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);

        //diccionario
        Map<String, List<Usuario>> map = new HashMap<String, List<Usuario>>();

        controladorUsuario.registrar();
        String correo = u.getCorreo();
        String contrasenia = u.getContraseña();
        String key = correo + contrasenia;
        map.put(key, null);
        boolean salir = false;
        int opcion;
        //menu
        while (!salir) {
            System.out.println("*********************");
            System.out.println("Bienvenido al programa de Denys");
            System.out.println("1.Registrarse \n2.Ya tengo cuenta\n3.Salir");

            try {
                System.out.println("Eliga una opcion");
                System.out.println("*********************");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        //registrar un usuario
                        controladorUsuario.registrar();
                        break;
                    case 2:

                        System.out.println("ingrese su correo electronico:");
                        String correo1 = input.next();
                        System.out.println("ingrese contraseña");
                        String contrasenia1 = input.next();
                        if (map.containsKey(key)) {
                            int opcion2;
                            boolean salir2 = false;
                            //registrar un usuario
                            //menu secudnario
                            while (!salir2) {
                                System.out.println("Que quiere hacer");
                                System.out.println("1.Registrar Telefono\n2.Modificar Telefono"
                                        + "\n3.Eliminar telefono\n4.Buscar Telefono\n5.Listar telefonos\n6.modificar datos del Usuario"
                                        + "\n7.Borrar usuario\n8.Buscar usuarios\n9.Listar usuarios\n10.Salir");
                                try {
                                    System.out.println("Elija una opcion");
                                    opcion2 = input.nextInt();

                                    switch (opcion2) {
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
                                            controladorTelefono.actulizar();
                                            break;
                                        case 7:
                                            controladorUsuario.eliminar();
                                            break;
                                        case 8:
                                            controladorUsuario.verUsuario();
                                            break;
                                        case 9:
                                            controladorUsuario.verUsuarios();
                                            break;
                                        case 10:
                                            salir = true;
                                            break;

                                        default:
                                            System.out.println("Solo numeros entre 1 y 6");

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Debes ingresar un numero");
                                    input.nextInt();
                                }
                            }
                        } else {
                            System.out.println("su correo o contraseña esta equivocado.");
                        }
                        break;
                    case 3:
                        salir = true;
                        break;

                }

            } catch (InputMismatchException e) {
            }
        }
    }
}
