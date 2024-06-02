/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WafflyApi.Servicios;

import com.example.WafflyApi.Entidades.Inventario;
import com.example.WafflyApi.Repositorios.inventario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SInventario {
     @Autowired
    inventario rProd;
     //Listar los registros de mi tabla
    
    public List<Inventario> mtObtenerProductos(){
    return rProd.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarProducto(Inventario rp){
    boolean resp=false;
    try{
        rProd.save((rp));
    }
    catch(Exception e){
        resp=false;  
    }
    return resp;
    }
    
    //Actualizar datos
    public void mtActualizarProducto(Inventario rp) {
        rProd.save((rp));
      
    }
    //Obtener un dato
    
    public Inventario mtObtenerProd(Integer idP){
        return rProd.getOne(idP);
        
    }
    //Eliminar 
    public void mtEliminarProd(Integer idP){
        rProd.deleteById(idP);
        
    }
    
}
