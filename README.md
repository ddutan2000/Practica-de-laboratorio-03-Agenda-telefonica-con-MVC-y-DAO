# Practica-de-laboratorio-03-Agenda-telefonica-con-MVC-y-DAO
Desarrollar una aplicación en Java para gestionar una agenda telefónica según los requerimientos planteados en las instrucciones de la práctica.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dutan2000
 */
/**clase Usuario**

public class Usuario
    /**
    **arributos**
    *se declaran los atributos del usuario y a la mimsa vez tambien se instancia una lista para la clases Telefono.
    */
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private List<Telefono> telefonos;


  /**
  **constructores**
  *se instancio dos contructores en la cual el primer constructor crea una nueva Array list para el objeto de tipo Telefono.
  *En el segundo constructor se encuentra todos los atributos de la clase usuario, pero estas estan colocadas como parametros del            constructor.
  */
    
    
    public Usuario() {
        telefonos = new ArrayList<>();
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        telefonos = new ArrayList<>();
    }
  
  
  /**
  **Getter y Setters**
  *los metodos getters devuelven un objeto de la clase Usuario.
  *los metodos setters colocan un objeto en la clase Usuario.
  */
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
/**
*los metodos para agregar, modificar, eliminar,buscar un telefono, y ver la lista de telefonos. se encuentran instanciados en la clase Usuario ya que el usuario una vez ingresado en el programa tiene que ingresar datos de tipo telefono. 
*/

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    public void modificarTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.set(index, telefono);
        } else {
            System.out.println("El telefono que quiere modificar no exsiste.");
        }
    }

    public void elimiarTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.remove(index);
            System.out.println("El telefono se ha borrado exitosamente");
        }
    }
    public Telefono buscarTelefono(int codigo){
        return telefonos.get(codigo);
    }
    public List<Telefono> listar(){
        return telefonos;
    }
    
  /**metodos de clase object**
  *este metodo asigna un valor unico a la cedula 
  *El metodo equals compara el onjeto para ver si es igual.
  *El metodo toString() convierte una linea de codigos en String.
  */

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nUsuario" + "\nCedula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nCorreo:" + correo + "\nContraseña: " + contraseña;
    }
    
  /**Clase Telefono**
  
    public class Telefono {
  /**Atributos**
  *se declaran los atributos del Telefono.
  */
  
    private int codigo;
    private String numero;
    private String tipo;
    private String operadora;
    
  /**constructores**
  *Primero se declara un contructor normal.
  *segundo se declara un constructor con los atributos de la clase telefono y esta son colocadas como parametros del constructor.
  */

    public Telefono() {
    }

    public Telefono(int codigo, String numero, String tipo, String operadora) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }
    
  /**
  **Getter y Setters**
  *los metodos getters devuelven un objeto de la clase Usuario.
  *los metodos setters colocan un objeto en la clase Usuario.
  */
  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
  /**metodos de clase object**
  *este metodo asigna un valor unico a la cedula 
  *El metodo equals compara el onjeto para ver si es igual.
  *El metodo toString() convierte una linea de codigos en String.
  */ 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "codigo=" + codigo + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + '}';
    }
    
}

/**ec.ups.edu.vista**
**clase VistaTelefono**
*/

    public class VistaTelefono {
/**atributos**
*se crea un escanner para que el usuario pueda ingresar valores por teclado.
*/

    private Scanner entrada;
 /**Constructor**
 *se crea un contructor que instancie un nuevo Scanner cada vez que es declarado.
 */
 
    public VistaTelefono(){
        entrada=new Scanner(System.in);
    }
    
  /**metodos registrar, modificar, eliminar, buscar, ver telefono y ver lista de telefonos.**
 *En estos metodos el usuario puede modificar a su gusto los datos del telefono. Todos estos datos seran ingresados por teclado. 
 */
 
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

/**Clase vistaUsuario**
*/

     public class VistaUsuario {
/**atributos** 
*se crea un escanner para que el usuario pueda ingresar valores por teclado.
*/

    private Scanner entrada; 
    
 /**Constructor**
 *se crea un contructor que instancie un nuevo Scanner cada vez que es declarado.
 */

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }
    
    
 /**metodos registrar, modificar, eliminar, buscar, ver usuario y ver lista de usuarios**
 *En estos metodos el usuario puede modificar a su gusto los datos del usuario. Todos estos datos seran ingresados por teclado. 
 */
 
    public Usuario registarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese los datos del Usuario");
        System.out.println("Cedula: ");
        String cedula=entrada.next();
        System.out.print("Nombre: ");
        String nombre= entrada.next();
        System.out.print("Apellido: ");
        String apellido =entrada.next();
        System.out.print("Correo: ");
        String correo=entrada.next();
        System.out.println("Contraseña: ");
        String contrasenia=entrada.next();
        
        return new Usuario(cedula, nombre, apellido, correo, contrasenia);
    }
    
    
    //metodod actualizar
    public Usuario modificarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingresa la cedula del usuario que desea modificar");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos datos del usuario (nombre, apellido, correo y contrseña)");
        String nombre = entrada.next();
        String apellido = entrada.next();
        String correo=entrada.next();
        String contrsenia=entrada.next();
        return new Usuario(cedula, nombre, apellido, correo, contrsenia);
    } 
    
    //metodo eliminar 
    public Usuario eliminarUsuario(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese la cedula del usuario que desea eliminar");
        String cedula =entrada.next();
        
        return new Usuario(cedula, null, null, null, null);
    }
    
    //metodo buscar telefono
    public String buscarUsuario(){
        entrada=new Scanner (System.in);
        System.out.println("Ingrese la cedula del usuario que desea buscar");
        String cedula =entrada.next();
        
        return cedula;
    } 
    
    //metodo listar telefonos
    public void verUsuario(Usuario usuario){
        System.out.println("Datos del usuario: "+ usuario);
    }
    
    public void verUsuario(List<Usuario> usuarios){
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del usuario: "+ usuario);
        }
    }

 /**ec.edu.ups.IDAO**
 **clase IUsarioDAO**
 *
 *dentro de esta interface se declaran los metodos CRUD y recibiendo como parametros objetos de tipos Usuario y un String. 
 */
`   public interface IUsuarioDAO{

        public void create(Usuario usuario);
        public Usuario read(String codigo);
        public void update(Usuario usuario);
        public void delete(Usuario usuario);   
        public List<Usuario> findAll();
    }
    
 /**
 **clase ITelefonoDAO**
 *
 *dentro de esta interface se declaran los metodos CRUD y recibiendo como parametros objetos de tipo Telefono y un int. 
 */

     public interface ITelefono {
     
        public void create(Telefono telefono);
        public Telefono read(int codigo);
        public void update(Telefono telefono);
        public void delete(Telefono telefono);   
        public List<Telefono> findAll();
    }

/**ec.ups.edu.IDAO
**clase TelefonDao**
*Esta clase impementa los metodos de la inteface ITelefonoDAO.
*/
public class TelefonoDao implements ITelefono{

  /**Atributos**
  *Esta clase tiene como atributos la lista Telefono.
  */
    private List<Telefono> listaTelefono;
    
  /**constructores**
  *esta clase tiene un constructor la cual crea una nueva lista cada vez que es instanciado.
  */

    public TelefonoDao() {
        listaTelefono=new ArrayList<>();
    }
  /**metodos CRUD**
  *estos metods impementan  

    @Override
    public void create(Telefono telefono) {
        listaTelefono.add(telefono);
    }

    @Override
    public Telefono read(int codigo) {
        for (Telefono telefono : listaTelefono) {
            if(telefono.getCodigo()==codigo){
                return telefono;
                
            }
            
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
        for (int i = 0; i < listaTelefono.size(); i++) {
            Telefono t=listaTelefono.get(i);
            if(t.getCodigo()==telefono.getCodigo()){
                listaTelefono.set(i, telefono);
                break;
            }
            
        }
    }

    @Override
    public void delete(Telefono telefono) {
        Iterator<Telefono> it=listaTelefono.iterator();
        while (it.hasNext()){
            Telefono t = it.next();
            if(t.getCodigo()==telefono.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Telefono> findAll() {
        return listaTelefono;
    }
}


    


