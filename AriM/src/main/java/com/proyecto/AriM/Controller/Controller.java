
package com.proyecto.AriM.Controller;

import com.proyecto.AriM.Entity.Persona;
import com.proyecto.AriM.Interface.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins ="http:localhost:4200")
public class Controller {
    @Autowired PersonaService personaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String creatrePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "Fue creado con éxito";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "Fue eliminado correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido")String nuevoApellido,
                               @RequestParam("edad") String nuevoEdad){
        Persona persona = personaService.findPersona(id);
        
        
        persona.setNombre(nuevoNombre);  
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevoEdad);
        
        personaService.savePersona(persona);
        return persona;
    }
}
