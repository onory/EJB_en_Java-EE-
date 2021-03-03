/*
 *esta cinterfase sera implementada para ser usada por PersonaServiceRemote
 */
package mx.com.ar.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.ar.sga.Domain.Persona;

@Remote // se indica que esta clase se usara de fomra remota entre el cliente y el server
public interface PersonaServiceRemote {
    
    //metodos en interface
    
    public List<Persona> listarPersonas ();
    
    public Persona encontrarPersonaPorId (Persona persona);
    public Persona encontrarPersonaPorEmail (Persona persona);
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    
    
    
}
