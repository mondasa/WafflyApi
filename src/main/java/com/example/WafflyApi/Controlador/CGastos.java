/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WafflyApi.Controlador;

import com.example.WafflyApi.Entidades.Gastos;
import com.example.WafflyApi.Servicios.SGastos;
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
@RequestMapping("/Gastos")
public class CGastos {
    @Autowired
   SGastos svGasto;
    @GetMapping("")
public List<Gastos> getRegistrosS(){
return svGasto.mtObtenerProductos();
        }
 @PostMapping("")
    public List<Gastos>postInsertarRegistro(@RequestBody Gastos rp){
        if(svGasto.mtInsertarProducto(rp)){
            return svGasto.mtObtenerProductos();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Gastos rcli ){
       svGasto.mtActualizarProducto(rcli);
   
   }
     @GetMapping("/{idP}")
     public Gastos obtServ(@PathVariable("idP")Integer idP){
         return svGasto.mtObtenerProd(idP);
     }
     @DeleteMapping("/{idP}")
    public void mEliminar(@PathVariable("idP")Integer idP){
        svGasto.mtEliminarProd(idP);
        
    }
}
