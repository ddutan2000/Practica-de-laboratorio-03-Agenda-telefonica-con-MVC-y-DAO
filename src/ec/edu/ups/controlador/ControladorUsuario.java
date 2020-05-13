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
import ec.edu.ups.dao.TelefonoDao;
import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;
/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario {
    
    //objeto vista 
    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    
    //objeto model
    private Usuario usuario;
    private Telefono telefono;
    //objeto DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefono telefonoDAO;
    
    //constructor

    public ControladorUsuario(VistaUsuario vistaUsuario, IUsuarioDAO usuarioDAO,VistaTelefono vistaTelefono, ITelefono telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = usuarioDAO;
        
        this.telefonoDAO = telefonoDAO;
        this.vistaTelefono = vistaTelefono;
    }



    
    //metodo DAO para guardar un usuario
    public void registrar(){
       usuario= vistaUsuario.registarUsuario();
       usuarioDAO.create(usuario);
    }
    
    //llamar al DAO para obtener usuario por la cedula y luego muestra en la vista 
    public void verUsuario(){
        String cedula=vistaUsuario.buscarUsuario();
        usuario=usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
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
        vistaUsuario.verUsuario(usuarios);
    }
    
    //metodo de agregacion de telefono
    public void agregarTelefono(){
        int codigo=vistaTelefono.buscarTelefono();
        //probablemente un metodo de if si es que no exsiste el el telefono
        telefono=telefonoDAO.read(codigo);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);
    }
}
