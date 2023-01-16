
package com.proyecto.AriM.Repository;

import com.proyecto.AriM.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}
