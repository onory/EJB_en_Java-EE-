/*
 * esta interface es local por eso se designa como @Local
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ar.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.ar.sga.Domain.Persona;

@Local //alcance de la interface
public interface PersonaService {
    
    //metodos en interface
    
    public List<Persona> listarPersonas ();
    
    public Persona encontrarPersonaPorId (Persona persona);
    public Persona encontrarPersonaPorEmail (Persona persona);
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    
}
