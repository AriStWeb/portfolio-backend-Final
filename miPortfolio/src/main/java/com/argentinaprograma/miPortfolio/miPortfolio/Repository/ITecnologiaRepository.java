
package com.argentinaprograma.miPortfolio.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITecnologiaRepository extends JpaRepository <Tecnologia ,Long> {
    
}