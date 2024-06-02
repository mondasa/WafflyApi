/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WafflyApi.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="inventario")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Inventario {
     @Id
    private int idinventario;
    @Column(length=7)
    private int existencias;
    @Column(length=50)
    private String nombreMateriaPrima;
    @Column(length=50)
    private String caducidad;
    @Column(length=7)
    private int precio;

    public Inventario() {
    }

    public Inventario(int idinventario, int existencias, String nombreMateriaPrima, String caducidad, int precio) {
        this.idinventario = idinventario;
        this.existencias = existencias;
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.caducidad = caducidad;
        this.precio = precio;
    }

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public void setNombreMateriaPrima(String nombreMateriaPrima) {
        this.nombreMateriaPrima = nombreMateriaPrima;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
