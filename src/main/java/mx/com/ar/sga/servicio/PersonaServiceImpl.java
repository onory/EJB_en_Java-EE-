/*
 * Esta clase es un EJB de tipo Stateless que implementa la clase PersonaServiceRemote
 * 
 * 
 */
package mx.com.ar.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.ar.sga.Domain.Persona;

@Stateless                                                     //implementa la interface local
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList <> ();
        personas.add( new Persona(1,"Adrian","Rivera","onoryxp@gmail.com","5532731322")); //se agrega un objeto de tipo Persona a la lista
        personas.add( new Persona(2,"Fernanda","Rivera","fer@gmail.com","548841257"));
        return personas;
                
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        
    }

    @Override
    public void modificarPersona(Persona persona) {
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        
    }

    
}
