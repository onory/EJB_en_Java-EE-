/*
 * Esta clase es accedida por el cliente por medio de serializacion para ser enviada por el server
 * por ello sera implementada para ser usada como una interface
 * 
 */
package mx.com.ar.sga.Domain;

import java.io.Serializable;


public class Persona  implements Serializable{
    
    private static final long serialVersionUID = 1L; //Esta valiable es requerida como requisito de Serializable
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    //constructores
    
    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    //metodos GET y SET

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", aplleido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
    
}
