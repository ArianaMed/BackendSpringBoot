
package com.proyecto.AriM.Interface;

import com.proyecto.AriM.Entity.Persona;
import java.util.List;



public interface PersonaService {
    
    
     public List<Persona> getPersona();
    
    
    public void savePersona (Persona persona);
    
    
    public void deletePersona (Long id);
    
    
    public Persona findPersona(Long id);
    
}
