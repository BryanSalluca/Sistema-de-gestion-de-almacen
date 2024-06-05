package org.entidad;

public class Empleado {
    
    private Integer idEmpleado;
    private String NombreEmpleado;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado, String NombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }
    
}

