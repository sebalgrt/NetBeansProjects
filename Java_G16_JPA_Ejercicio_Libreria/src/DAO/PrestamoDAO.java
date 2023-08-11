/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java_g16_jpa_ejercicio_libreria.Entidades.Prestamo;

/**
 *
 * @author Seba
 */
public final class PrestamoDAO extends DAO<Prestamo> {

    @Override
    public void borrar(Prestamo objeto) {
        super.borrar(objeto);
        System.out.println("Prestamo eliminado correctamente");
        System.out.println("");
    }

    @Override
    public void modificar(Prestamo objeto) {
        super.modificar(objeto);
        if (objeto.getDevolucion() != null) {
            System.out.println("Prestamo modificado correctamente");
            System.out.println("");
        }
    }

    @Override
    public void crear(Prestamo objeto) {
        super.crear(objeto);
        System.out.println("Prestamo creado correctamente");
        System.out.println("");
    }
    
    public Prestamo buscarPrestamoId(Integer id) {
        return em.find(Prestamo.class, id);
    }
    
}
