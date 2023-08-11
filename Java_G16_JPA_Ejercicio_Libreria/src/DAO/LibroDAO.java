/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import java_g16_jpa_ejercicio_libreria.Entidades.Libro;

/**
 *
 * @author Seba
 */
public final class LibroDAO extends DAO<Libro>{

    @Override
    public void borrar(Libro objeto) {
        super.borrar(objeto);
        System.out.println("Libro borrado correctamente");
        System.out.println("");
    }

    @Override
    public void modificar(Libro objeto) {
        super.modificar(objeto);
        System.out.println("El libro se modificó correctamente");
        System.out.println("");
    }

    @Override
    public void crear(Libro objeto) {
        super.crear(objeto);
        System.out.println("Libro creado correctamente");
        System.out.println("");
    }

    public Libro buscarLibroISBN(Long isbn) {
        return em.find(Libro.class, isbn);
    }
    
    public List<Libro> buscarLibroNombre(String nombre) {
        List<Libro> libros = new ArrayList();
        try {
            String buscar = "%" + nombre + "%";
            libros = em.createQuery("SELECT a FROM Libro a WHERE a.nombre LIKE :nom")
                        .setParameter("nom", buscar).getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return libros;
    }
    
    public List<Libro> mostrarLibros() {
        List<Libro> libros = new ArrayList();
        try {
            libros = em.createQuery("SELECT a FROM Libro a").getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return libros;
    }
}
