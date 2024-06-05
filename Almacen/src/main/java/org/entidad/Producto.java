package org.entidad;

public class Producto {
    
    private Integer idProducto;
    private String Nombre;
    private String Detalle;
    private Integer Stock;

    public Producto() {
    }

    public Producto(Integer idProducto, String Nombre, String Detalle, Integer Stock) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Detalle = Detalle;
        this.Stock = Stock;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }
    
    
    
}
