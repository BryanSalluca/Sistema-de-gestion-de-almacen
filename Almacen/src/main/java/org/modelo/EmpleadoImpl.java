package org.entidad;

import jakarta.persistence.EntityManager;
import org.interfaces.iEmpleado;
import org.servicio.Acceso;
import java.util.List;

public class EmpleadoImpl implements iEmpleado<Empleado> {
    
    private EntityManager entityManager(){
    return Acceso.getAcceso().getEmf().createEntityManager();
            }
    
    EntityManager em = entityManager();
    
    @Override
    public void GenerarReporte(Empleado empleado) {
          try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
            System.out.println("REPORTE GENERADO");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("ERROR"+e.getMessage());
        }
    }

    @Override
    public void CrearPedido(Empleado empleado) {
             try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
            System.out.println("PEDIDO CREADO");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("ERROR"+e.getMessage());
        }
    }

    @Override
    public void ListarProductos(Empleado empleado) {
    }

    @Override
    public void RegistrarNotaDeSalida(Empleado empleado) {
                try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
            System.out.println("NOTA DE SALIDA REGISTRADA");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("ERROR"+e.getMessage());
        }
    }

    @Override
    public void ListarProductos() {
    }
    }

    @Override
    public <T> List <error>() {
      
    } 
    
}

