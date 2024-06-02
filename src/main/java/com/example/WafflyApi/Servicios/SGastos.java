/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WafflyApi.Servicios;

import com.example.WafflyApi.Entidades.Gastos;
import com.example.WafflyApi.Repositorios.gastos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SGastos {
     @Autowired
    gastos rProd;
     //Listar los registros de mi tabla
    
    public List<Gastos> mtObtenerProductos(){
    return rProd.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarProducto(Gastos rp){
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
    public void mtActualizarProducto(Gastos rp) {
        rProd.save((rp));
      
    }
    //Obtener un dato
    
    public Gastos mtObtenerProd(Integer idP){
        return rProd.getOne(idP);
        
    }
    //Eliminar 
    public void mtEliminarProd(Integer idP){
        rProd.deleteById(idP);
        
    }
}
