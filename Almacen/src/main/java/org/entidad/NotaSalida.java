package org.entidad;

public class NotaSalida {
    
    private Integer idNotaSalida;
    private String DetalleSalida;
    private Integer CantidadProductos;

    public NotaSalida() {
    }

    public NotaSalida(Integer idNotaSalida, String DetalleSalida, Integer CantidadProductos) {
        this.idNotaSalida = idNotaSalida;
        this.DetalleSalida = DetalleSalida;
        this.CantidadProductos = CantidadProductos;
    }

    public Integer getIdNotaSalida() {
        return idNotaSalida;
    }

    public void setIdNotaSalida(Integer idNotaSalida) {
        this.idNotaSalida = idNotaSalida;
    }

    public String getDetalleSalida() {
        return DetalleSalida;
    }

    public void setDetalleSalida(String DetalleSalida) {
        this.DetalleSalida = DetalleSalida;
    }

    public Integer getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(Integer CantidadProductos) {
        this.CantidadProductos = CantidadProductos;
    }
    
    
}
