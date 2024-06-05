package org.entidad;

public class Almacen {
    
    private Integer idAlmacen;
    private String NombreAlmacen;

    public Almacen() {
    }

    public Almacen(Integer idAlmacen, String NombreAlmacen) {
        this.idAlmacen = idAlmacen;
        this.NombreAlmacen = NombreAlmacen;
    }

    public Integer getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreAlmacen() {
        return NombreAlmacen;
    }

    public void setNombreAlmacen(String NombreAlmacen) {
        this.NombreAlmacen = NombreAlmacen;
    }
    
        
}
