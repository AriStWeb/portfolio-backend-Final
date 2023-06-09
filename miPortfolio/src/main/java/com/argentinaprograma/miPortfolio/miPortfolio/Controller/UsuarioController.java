
package com.argentinaprograma.miPortfolio.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Usuario;
import com.argentinaprograma.miPortfolio.miPortfolio.Service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("https://mypotfolioweb-frontend.web.app/")
@RestController
public class UsuarioController {
        @Autowired
    private IUsuarioService interUser;
    
    @GetMapping ("/usuario/ver")
    public List <Usuario> getUsuario(){
        return interUser.getUsuario();
    }
    
    @PostMapping ("/usuario/agregar")
    public String createUsuario(@RequestBody Usuario user){
        interUser.saveUsuario(user);
        return "El usuario fue creado con exito";
    }
    
    @DeleteMapping ("/usuario/eliminar/{id}")
    public String deleteUsuario (@PathVariable Long id){
    interUser.deleteUsuario(id);
        return "El usuario fue eliminado con exito";
    }
    
    @PutMapping ("/usuario/editar/{id}")
    public Usuario editUsuario (@PathVariable Long id,
                                @RequestParam ("email") String nvoEmail,
                                @RequestParam ("password") String nvoPassword,
                                 @RequestParam ("nombre") String nvoNombre
                                ){
            Usuario user = interUser.findUsuario(id);
            
           user.setEmail(nvoEmail);
           user.setPassword(nvoPassword);
           user.setNombre(nvoNombre);
           
           interUser.saveUsuario(user);
            
            return user;
              }
}