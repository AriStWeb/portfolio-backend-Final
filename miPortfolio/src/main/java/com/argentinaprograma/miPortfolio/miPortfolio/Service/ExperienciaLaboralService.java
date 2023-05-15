/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.miPortfolio.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.ExperienciaLaboral;
import com.argentinaprograma.miPortfolio.miPortfolio.Repository.IExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{
    
    @Autowired
    private IExperienciaLaboralRepository expLabRepository;

    @Override
    public List<ExperienciaLaboral> getExperienciaLaboral() {
        List<ExperienciaLaboral> listaExperienciasLaborales = expLabRepository.findAll();
        return listaExperienciasLaborales;
    }

    @Override
    public void saveExperienciaLaboral(ExperienciaLaboral expLab) {
        expLabRepository.save(expLab);
    }

    @Override
    public void deleteExperienciasLaborales(Long id) {
        expLabRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findExperienciaLaboral(Long id) {
         ExperienciaLaboral expLab= expLabRepository.findById(id).orElse(null);
        return expLab;   
    }
    
}
