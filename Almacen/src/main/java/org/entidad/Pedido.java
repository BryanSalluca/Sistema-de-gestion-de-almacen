package org.entidad;

import java.util.Date;

public class Pedido {

    private Integer idPedido;
    private String DetallePedido;
    private Date FechaPedido;

    public Pedido() {
    }

    public Pedido(Integer idPedido, String DetallePedido, Date FechaPedido) {
        this.idPedido = idPedido;
        this.DetallePedido = DetallePedido;
        this.FechaPedido = FechaPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getDetallePedido() {
        return DetallePedido;
    }

    public void setDetallePedido(String DetallePedido) {
        this.DetallePedido = DetallePedido;
    }

    public Date getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(Date FechaPedido) {
        this.FechaPedido = FechaPedido;
    }
    
    
}
