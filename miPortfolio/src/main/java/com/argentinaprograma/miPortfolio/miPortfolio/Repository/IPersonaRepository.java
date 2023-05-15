
package com.argentinaprograma.miPortfolio.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long >{
       
}