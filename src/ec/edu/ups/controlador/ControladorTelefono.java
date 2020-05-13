/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDao;
import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorTelefono {
    //objeto vista
    private VistaTelefono vistatelefono;
    //objeto modelo
    private Telefono telefono;
    //objeto IDAO
    private ITelefono telefonoDAO;
    
    //constructor
    public ControladorTelefono(VistaTelefono vistatelefono, ITelefono telefonoDAO) {
        this.vistatelefono = vistatelefono;
        this.telefonoDAO = telefonoDAO;
    }
    
    //llama al DAO para guardar un telefono
    public void registrar(){
        telefono=vistatelefono.registrarTelefono();
        telefonoDAO.create(telefono);
    }
    
    //llama al dao para obtener un telefono por el codigo y luego enviar a vista 
    public void verTelefono(){
        int codigo=vistatelefono.buscarTelefono();
        telefono=telefonoDAO.read(codigo);
        vistatelefono.verTelefono(telefono);
    }
     //llamar al dao para que actualize un telefono
    public void actulizar(){
        telefono=vistatelefono.modificarTelefono();
        telefonoDAO.update(telefono);
    }
    //llamar al DAO elimianr un telefono
    public void eliminar(){
        telefono=vistatelefono.elimiarTelefono();
        telefonoDAO.delete(telefono);
    }
    //llamar al DAO para obtener todos los telefonos y luego enviar a vista 
    public void verTelefonos(){
        List<Telefono> telefonos;
        telefonos=telefonoDAO.findAll();
        vistatelefono.verTelefonos(telefonos);
    }
}
