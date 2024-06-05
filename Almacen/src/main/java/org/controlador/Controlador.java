package org.controlador;

import jakarta.persistence.EntityManager;
import org.servicio.Acceso;
import org.entidad.Empleado;

public class Controlador {
    
    EntityManager em = entitymanager();
    
    public void CrearCliente(Empleado empleado){
    
        try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        
                
    }
    
    public EntityManager entitymanager(){
        return Acceso.getAcceso().getEmf().createEntityManager();
    }
    
}
