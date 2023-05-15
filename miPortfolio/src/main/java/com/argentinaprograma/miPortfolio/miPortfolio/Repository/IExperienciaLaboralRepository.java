
package com.argentinaprograma.miPortfolio.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral, Long>{
    
}