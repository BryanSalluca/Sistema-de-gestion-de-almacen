package org.servicio;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Acceso {
    
    public static Acceso acceso = new Acceso();

    public static Object getConectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public EntityManagerFactory emf;

    private Acceso() {
        emf = Persistence.createEntityManagerFactory("ClientePU");
    }

    public static Acceso getAcceso() {
        return acceso;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }
    
    
    
    
}
