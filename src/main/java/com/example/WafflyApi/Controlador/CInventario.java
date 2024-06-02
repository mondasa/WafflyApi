/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WafflyApi.Controlador;
import com.example.WafflyApi.Entidades.Inventario;
import com.example.WafflyApi.Servicios.SInventario;
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
@RequestMapping("/Inventario")

public class CInventario {
     @Autowired
   SInventario svInventario;
    @GetMapping("")
public List<Inventario> getRegistrosS(){
return svInventario.mtObtenerProductos();
        }
 @PostMapping("")
    public List<Inventario>postInsertarRegistro(@RequestBody Inventario rp){
        if(svInventario.mtInsertarProducto(rp)){
            return svInventario.mtObtenerProductos();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Inventario rcli ){
       svInventario.mtActualizarProducto(rcli);
   
   }
     @GetMapping("/{idP}")
     public Inventario obtServ(@PathVariable("idP")Integer idP){
         return svInventario.mtObtenerProd(idP);
     }
     @DeleteMapping("/{idP}")
    public void mEliminar(@PathVariable("idP")Integer idP){
        svInventario.mtEliminarProd(idP);
        
    }
    
}
