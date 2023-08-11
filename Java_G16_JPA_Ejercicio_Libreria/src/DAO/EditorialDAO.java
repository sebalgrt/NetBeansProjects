/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import java_g16_jpa_ejercicio_libreria.Entidades.Editorial;

/**
 *
 * @author Seba
 */
public final class EditorialDAO extends DAO<Editorial>{
    List<Editorial> editoriales = new ArrayList();

    @Override
    public void borrar(Editorial objeto) {
        super.borrar(objeto);
        System.out.println("Editorial borrada correctamente");
        System.out.println("");
    }

    @Override
    public void modificar(Editorial objeto) {
        super.modificar(objeto);
        System.out.println("La editorial se modificó correctamente");
        System.out.println("");
    }

    @Override
    public void crear(Editorial objeto) {
        super.crear(objeto);
        System.out.println("Editorial creada correctamente");
        System.out.println("");
    }

    public Editorial buscarEditorialID(Integer id) {
        return em.find(Editorial.class, id);
    }
    
    public List<Editorial> buscarEditorialNombre(String nombre) {
        try {
            String buscar = "%" + nombre + "%";
            editoriales = em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nom")
                        .setParameter("nom", buscar).getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return editoriales;
    }
    
    public List<Editorial> mostrarEditoriales() {
        try {
            editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return editoriales;
    }
    
}
