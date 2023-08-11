/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Seba
 * @param <T>
 */
public abstract class DAO<T> {
    final EntityManager em = Persistence
            .createEntityManagerFactory("LibreriaPU").createEntityManager();
    
    protected void desconectarDB() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    protected void crear(T objeto) {
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error: datos no ingresados");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
    }
    
    protected void modificar(T objeto) {
        try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error: datos no ingresados");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
    }
    
    protected void borrar(T objeto) {
        try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error: datos no ingresados");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
    }

}
