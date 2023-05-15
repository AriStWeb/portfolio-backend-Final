
package com.argentinaprograma.miPortfolio.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Proyecto;
import java.util.List;

public interface IProyectoService {
     
    public List<Proyecto> getProyecto();
    
    public void saveProyectos(Proyecto proyect);
    
    public void deleteProyecto(Long id);
     
    public Proyecto findProyecto(Long id);
}