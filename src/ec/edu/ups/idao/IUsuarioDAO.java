/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;
import java.util.List;
import ec.edu.ups.modelo.Usuario; 
/**
 *
 * @author Dutan2000
 */
public interface IUsuarioDAO {
     //Métodos CRUD
    public void create(Usuario usuario);
    public Usuario read(int codigo);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);   
    public List<Usuario> findAll();
}
