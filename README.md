# Practica-de-laboratorio-03-Agenda-telefonica-con-MVC-y-DAO
Desarrollar una aplicación en Java para gestionar una agenda telefónica según los requerimientos planteados en las instrucciones de la práctica.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


* @author Denys Dutan

**Clase Usuario**

    public class Usuario
    
   **Atributos**
   
   Se declaran los atributos del usuario y a la mimsa vez tambien se instancia una lista para la clases Telefono.

    
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private List<Telefono> telefonos;


  **constructores**
  
  se instancio dos contructores en la cual el primer constructor crea una nueva Array list para el objeto de tipo Telefono.
  En el segundo constructor se encuentra todos los atributos de la clase usuario, pero estas estan colocadas como parametros del            constructor.
    
    
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
  
  
  **Getter y Setters**
  Los metodos getters devuelven un objeto de la clase Usuario.
  Los metodos setters colocan un objeto en la clase Usuario.
    
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
    
**Metodos**

Los metodos para agregar, modificar, eliminar,buscar un telefono, y ver la lista de telefonos. se encuentran instanciados en la clase Usuario ya que el usuario una vez ingresado en el programa tiene que ingresar datos de tipo telefono. 

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
    
 **metodos de clase object**
 
  Este metodo asigna un valor unico a la cedula 
  El metodo equals compara el onjeto para ver si es igual.
  El metodo toString() convierte una linea de codigos en String.

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
    
 **Clase Telefono**
  
    public class Telefono {
    
**Atributos**
 se declaran los atributos del Telefono.

  
    private int codigo;
    private String numero;
    private String tipo;
    private String operadora;
    
 **constructores**
  Primero se declara un contructor normal.
  segundo se declara un constructor con los atributos de la clase telefono y esta son colocadas como parametros del constructor.


    public Telefono() {
    }

    public Telefono(int codigo, String numero, String tipo, String operadora) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }
    

  **Getter y Setters**
  
  los metodos getters devuelven un objeto de la clase Usuario.
  los metodos setters colocan un objeto en la clase Usuario.
 
  
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
    
**metodos de clase object**
  Este metodo asigna un valor unico a la cedula 
  El metodo equals compara el onjeto para ver si es igual.
  El metodo toString() convierte una linea de codigos en String. 

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

**ec.ups.edu.vista**

**clase VistaTelefono**


    public class VistaTelefono {
**Atributos**
Se crea un escanner para que el usuario pueda ingresar valores por teclado.


    private Scanner entrada;
 **Constructor**
 Se crea un contructor que instancie un nuevo Scanner cada vez que es declarado.

 
    public VistaTelefono(){
        entrada=new Scanner(System.in);
    }
    
 **metodos registrar, modificar, eliminar, buscar, ver telefono y ver lista de telefonos.**
 En estos metodos el usuario puede modificar a su gusto los datos del telefono. Todos estos datos seran ingresados por teclado. 

 
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

**Clase vistaUsuario**

     public class VistaUsuario 
     
**Atributos** 

Se crea un escanner para que el usuario pueda ingresar valores por teclado.


    private Scanner entrada; 
    
 **Constructor**
 
 Se crea un contructor que instancie un nuevo Scanner cada vez que es declarado.

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }
    
    
 **Metodos registrar, modificar, eliminar, buscar, ver usuario y ver lista de usuarios**
 
 En estos metodos el usuario puede modificar a su gusto los datos del usuario. Todos estos datos seran ingresados por teclado. 

 
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

**ec.edu.ups.IDAO**
 
**Clase IUsarioDAO**

    public interface IUsuarioDAO{
    
**Metodos CRUD**

 Dentro de esta interface se declaran los metodos CRUD y recibiendo como parametros objetos de tipos Usuario y un String. 

`   public interface IUsuarioDAO{

        public void create(Usuario usuario);
        public Usuario read(String codigo);
        public void update(Usuario usuario);
        public void delete(Usuario usuario);   
        public List<Usuario> findAll();
    }
    
**Clase ITelefonoDAO**
 
Dentro de esta interface se declaran los metodos CRUD y recibiendo como parametros objetos de tipo Telefono y un int. 

     public interface ITelefono {
**Metodo CRUD**
     
        public void create(Telefono telefono);
        public Telefono read(int codigo);
        public void update(Telefono telefono);
        public void delete(Telefono telefono);   
        public List<Telefono> findAll();
    }

**ec.ups.edu.IDAO**

**clase TelefonDao**

Esta clase impementa los metodos de la inteface ITelefonoDAO.


    public class TelefonoDao implements ITelefono{

**Atributos**

Esta clase tiene como atributos la lista Telefono.

    private List<Telefono> listaTelefono;
    
**Constructores**

Esta clase tiene un constructor la cual crea una nueva lista cada vez que es instanciado.


    public TelefonoDao() {
        listaTelefono=new ArrayList<>();
    }
**Metodos de herencia CRUD**

Estos metodos impementan los metodos de la interface Itelefono. Etos metodos permiten Crear, leer o confirmar, actualizar, borrar y listar los objetos de tipo Telefono.    

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

**Clase UsuarioDao**

Esta clase impementa los metodos de la inteface IUsuarioDAO.


    public class UsuarioDAO implements IUsuarioDAO {

**Atributos**

Esta clase tiene como atributos la lista Usuario.


    private List<Usuario> listaUsuario;
    
**Constructores**
Esta clase tiene un constructor la cual crea una nueva lista cada vez que es instanciado.

    public UsuarioDAO() {
        listaUsuario = new ArrayList<>();
    }

**Metodos de herencia CRUD**
Estos metodos impementan los metodos de la interface Itelefono. Etos metodos permiten Crear, leer o confirmar, actualizar, borrar y listar los objetos de tipo Telefono. 
 
    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    @Override
    public Usuario read(String cedula) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCedula().equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = listaUsuario.get(i);
            if (u.getCedula().equals(usuario.getCedula())) {
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it =listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario u = it.next();
            if(u.getCedula().equals(usuario.getCedula())){
                it.remove();
                break;
            }
            
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuario;
    }
  }


**ec.ups.edu.Controlador**

**Clase ControladorTelefono**

  public class ControladorTelefono {

Atributo privado de paquete vista 

    private VistaTelefono vistatelefono;
    
Atributo privado de paquete modelo

    private Telefono telefono;

Atributo privado de paquete IDAO

    private ITelefono telefonoDAO;
    
**Constructor**

El constructor de esta clase tiene como parametros un objeto de tipo VistaTelefono y un objeto de tipo Itelefono.

    public ControladorTelefono(VistaTelefono vistatelefono, ITelefono telefonoDAO) {
        this.vistatelefono = vistatelefono;
        this.telefonoDAO = telefonoDAO;
    }
    
**Metodos DAO**
 
 Estos metodos asignan un valor al objeto de tipo Telefono y estos mismos llaman al metodo DAO y lo asignan en su clase, archivandolo.
 Estos metodos permiten registrar, ver, actualizar, eliminar, y listar un telfono o varios. 
 
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



**Clase ControladorUsuario**

   public class ControladorUsuario {
    
Atributo privado de paquete vista 

    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    
Atributo privado de paquete modelo


    private Usuario usuario;
    private Telefono telefono;

Atributo privado de paquete IDAO


    private IUsuarioDAO usuarioDAO;
    private ITelefono telefonoDAO;
    
**Constructor**

El constructor de esta clase tiene como parametros dos objetos de tipo Vista y dos objetos de tipo IDAO.


    public ControladorUsuario(VistaUsuario vistaUsuario, IUsuarioDAO usuarioDAO,VistaTelefono vistaTelefono, ITelefono telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = usuarioDAO;
        
        this.telefonoDAO = telefonoDAO;
        this.vistaTelefono = vistaTelefono;
    }
    

**Metodos DAO**
 
 Estos metodos asignan un valor al objeto de tipo Usuario y estos mismos llaman al metodo DAO y lo asignan en su clase, archivandolo.
 Estos metodos permiten registrar, ver, actualizar, eliminar, y listar un usuario o varios.
 Este metodo tambien tiene un metodo de agregacion para que el usuario pueda añadir un telefono. 

 
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

**ec.ups.edu.Test**

**test**
Al momento que corre el programa el usuario debe registrar un usario inmediatamente. Ete la va a pedir que llene todos los datos del usuario, a la misma vez se guarda la contraseña y el correo en una key. 
Una vez que se haya registrado el usuario, aparece un menu y tiene la opcion de registrar un nuevo usuario o de registrar un telefono o varios.
El usuario puede modificar, borrar y buscar usuarios y telefonos.
La ultima opcion del menu lo saca del programa y deja de correr el programa. 

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
