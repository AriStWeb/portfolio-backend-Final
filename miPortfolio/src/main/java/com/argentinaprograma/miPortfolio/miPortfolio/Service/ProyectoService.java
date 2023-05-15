
package com.argentinaprograma.miPortfolio.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Proyecto;
import com.argentinaprograma.miPortfolio.miPortfolio.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
     private IProyectoRepository proyectRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyectos = proyectRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyectos(Proyecto proyect) {
    proyectRepository.save(proyect);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyectRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proy= proyectRepository.findById(id).orElse(null);
        return proy;
    }
    
    
}