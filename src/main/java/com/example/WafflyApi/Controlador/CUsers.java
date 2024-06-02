
package com.example.WafflyApi.Controlador;

import com.example.WafflyApi.Entidades.Users;
import com.example.WafflyApi.Servicios.SUsers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class CUsers {
    @Autowired
   SUsers svUser;
    @GetMapping("")
public List<Users> getRegistros(){
return svUser.mtObtenerU();
        }
 @PostMapping("")
    public List<Users>postInsertarRegistro(@RequestBody Users user){
        if(svUser.mtInsertarU(user)){
            return svUser.mtObtenerU();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Users user ){
       svUser.mtActualizarU(user);
   
   }
     @GetMapping("/{noP}")
     public Users obtServ(@PathVariable("noP")Integer noP){
         return svUser.mtObtenerProd(noP);
     }
     @DeleteMapping("/{noP}")
    public void mEliminar(@PathVariable("noP")Integer noP){
        svUser.mtEliminarProd(noP);
        
    }
    
}
