/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import java_g16_jpa_ejercicio_libreria.Entidades.Autor;

/**
 *
 * @author Seba
 */
public final class AutorDAO extends DAO<Autor>{

    @Override
    public void borrar(Autor objeto) {
        super.borrar(objeto);
        System.out.println("Autor borrado correctamente");
        System.out.println("");
    }

    @Override
    public void modificar(Autor objeto) {
        super.modificar(objeto);
        System.out.println("El autor se modificó correctamente");
        System.out.println("");
    }

    @Override
    public void crear(Autor objeto) {
        super.crear(objeto);
        System.out.println("Autor creado correctamente");
        System.out.println("");
    }

    public Autor buscarAutorID(Integer id) {
        return em.find(Autor.class, id);
    }
    
    public List<Autor> buscarAutorNombre(String nombre) {
        List<Autor> autores = new ArrayList();
        try {
            String buscar = "%" + nombre + "%";
            autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom")
                        .setParameter("nom", buscar).getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return autores;
    }
    
    public List<Autor> mostrarAutores() {
        List<Autor> autores = new ArrayList();
        try {
            autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return autores;
    }
}
