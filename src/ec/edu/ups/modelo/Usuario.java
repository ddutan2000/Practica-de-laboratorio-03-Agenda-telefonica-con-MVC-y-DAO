/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;
/**
 *
 * @author Dutan2000
 */
public class Usuario {
    //atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private Telefono[] telefonos;
    
    //constructor

    public Usuario() {
    }

    public Usuario(int numeroDeTelefonos){
        telefonos= new Telefono[numeroDeTelefonos];
    }
    public Usuario(String cedula, String nombre, String apellido, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    //getters y setters

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
    
    //metodos de clase object

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
    
    //metodo agregar telefono
    public void agregarTelefono(int codigo, String numero, String tipo, String operadora){
        Telefono telefono = new Telefono(codigo, numero, tipo, operadora);
        for (int i = 0; i < telefonos.length; i++) {
            if(telefonos[i]==null){
                telefonos[i]=telefono;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "\nUsuario" + "\nCedula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nCorreo=" + correo + "\nContraseña: " + contraseña ;
    }
    
}
