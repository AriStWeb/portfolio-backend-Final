
package com.argentinaprograma.miPortfolio.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario,Long> {

}
