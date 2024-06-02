
package com.example.WafflyApi.Entidades;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Productos {
     @Id
    private int idProd;
    @Column(length=30)
    private String nombreProd;
    @Column(length=7)
    private int precio;
    @Column(length=20)
    private String categoria;
    @Column(length=50)
    private String descripcion;

    public Productos() {
    }

    public Productos(int idProd, String nombreProd, int precio, String categoria, String descripcion) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
