
package com.argentinaprograma.miPortfolio.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersonas(Persona perso);
    
    public void deletePersonas(Long id);
     
    public Persona findPersonas(Long id);
}
