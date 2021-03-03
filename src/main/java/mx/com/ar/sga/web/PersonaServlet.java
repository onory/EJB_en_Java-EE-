/*
 * capa web para acceder a la capa de servicio donde esta el EJB
 */
package mx.com.ar.sga.web;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.ar.sga.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import mx.com.ar.sga.Domain.Persona;

@WebServlet("/personas") //define el nombre del servlet
public class PersonaServlet extends HttpServlet {
    
   
    @Inject  //inyeccion del  EJB local a este servlet
    PersonaService personaService ; //variable de tipo de interface que consumira
    
    @Override //sobre escribimos el metodo doget de HttpServlet
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        
        //acedera al listado de personas por medio de la instancia recibida de EJB
        
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("personas: " + personas);
        request.setAttribute("personas",personas); // colocamos el listado en el alcane de request
                                    //enviamos a JSP         forward coloca en request y response el alcance de personas al JSP
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
        
        
        
    }
    
    
    
}
