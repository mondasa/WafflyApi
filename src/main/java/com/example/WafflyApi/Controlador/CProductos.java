
package com.example.WafflyApi.Controlador;

import com.example.WafflyApi.Entidades.Productos;
import com.example.WafflyApi.Servicios.SProductos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Productos")
public class CProductos {
    @Autowired
   SProductos svProductos;
    @GetMapping("")
public List<Productos> getRegistrosS(){
return svProductos.mtObtenerProductos();
        }
 @PostMapping("")
    public List<Productos>postInsertarRegistro(@RequestBody Productos rp){
        if(svProductos.mtInsertarProducto(rp)){
            return svProductos.mtObtenerProductos();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Productos rcli ){
       svProductos.mtActualizarProducto(rcli);
   
   }
     @GetMapping("/{idP}")
     public Productos obtServ(@PathVariable("idP")Integer idP){
         return svProductos.mtObtenerProd(idP);
     }
     @DeleteMapping("/{idP}")
    public void mEliminar(@PathVariable("idP")Integer idP){
        svProductos.mtEliminarProd(idP);
        
    }
    @GetMapping("/query")
    public ArrayList<Productos> mtFiltarC(@RequestParam("categoria") String categoria){
        return svProductos.mtFiltarCat(categoria);
    
}
    
}
