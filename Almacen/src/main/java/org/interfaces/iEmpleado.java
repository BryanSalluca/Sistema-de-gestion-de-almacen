package org.interfaces;

import java.util.List;

public interface iEmpleado <T> {
    
    public void GenerarReporte(T t);
    
    public void CrearPedido(T t);
    
    public void List<T> List();
    
    public void RegistrarNotaDeSalida(T t);
    
}
