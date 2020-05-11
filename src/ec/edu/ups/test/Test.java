/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;

/**
 *
 * @author Dutan2000
 */
public class Test {
    public static void main(String[] args){
        //vista
        VistaUsuario vista=new VistaUsuario();
        //controlador
        ControladorUsuario controlador =new ControladorUsuario(vista);
        
        //guardarun cliente atravez del controlador
        controlador.registrar();
        
        
    }
}
