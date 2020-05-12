/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import java.util.List;
/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario {
    
    //objeto vista 
    private VistaUsuario vistaUsuario;
    private Usuario usuario;
    private IUsuarioDAO usuarioDAO;
    
    //constructor

    public ControladorUsuario(VistaUsuario vistaUsuario) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO= new UsuarioDAO();
        
    }
    
    //metodo DAO para guardar un usuario
    public void registrar(){
       usuario= vistaUsuario.registarTelefono();
       usuarioDAO.create(usuario);
    }
    
    //llamar al DAO para obtener usuario por la cedula y luego muestra en la vista 
    public void verUsuario(){
        int codigo =vistaUsuario.buscarTelefono();
        usuario=usuarioDAO.read(codigo);
        vistaUsuario.verTelefono(telefono);
    }
    //llamar a DAO para actualizar un usuario
    public void actualizar(){
        usuario=vistaUsuario.modificarUsuario();
        usuarioDAO.update(usuario);
    }
    
    //eliminar un cliente 
    public void eliminar(){
        usuario = vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
        
    }
    
    //llama al DAO para obtener todos los Usuarios y luego mostrar en vista
    public void verUsuarios(){
        List<Usuario>usuarios;
        usuarios =usuarioDAO.findAll();
        vistaUsuario.verUsuario(usuario);
    }
}
