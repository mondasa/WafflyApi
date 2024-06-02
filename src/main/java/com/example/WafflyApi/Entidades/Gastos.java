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
@Table(name="gastos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Gastos {
    @Id
    private int idGastos;
    @Column(length=100)
        private String descripcion;
    @Column(length=7)
    private int monto;
    @Column(length=30)
    private String fecha;

    public Gastos() {
    }

    public Gastos(int idGastos, String descripcion, int monto, String fecha) {
        this.idGastos = idGastos;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdGastos() {
        return idGastos;
    }

    public void setIdGastos(int idGastos) {
        this.idGastos = idGastos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
