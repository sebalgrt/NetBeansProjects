/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.util.List;
import java.util.ArrayList;
import java_g16_jpa_ejercicio_libreria.Entidades.Cliente;

/**
 *
 * @author Seba
 */
public final class ClienteDAO extends DAO<Cliente>{
    List<Cliente> clientes = new ArrayList();
    
    @Override
    public void borrar(Cliente objeto) {
        super.borrar(objeto);
        System.out.println("Cliente borrado correctamente");
        System.out.println("");
    }

    @Override
    public void modificar(Cliente objeto) {
        super.modificar(objeto);
        System.out.println("El cliente se modificó correctamente");
        System.out.println("");
    }

    @Override
    public void crear(Cliente objeto) {
        super.crear(objeto);
        System.out.println("Cliente creado correctamente");
        System.out.println("");
    }
    
    public Cliente buscarClienteId(Integer id) {
        return em.find(Cliente.class, id);
    }
    
    public List<Cliente> buscarClienteNombre(String apellido) {
        try {
            String buscar = "%" + apellido + "%";
            clientes = em.createQuery("SELECT a FROM Cliente a WHERE a.apellido LIKE ape")
                        .setParameter("ape", buscar).getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return clientes;
    }
    
    public List<Cliente> mostrarClientes() {
        try {
            clientes = em.createQuery("SELECT a FROM Cliente a").getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
//        } finally {
//            desconectarDB();
        }
        return clientes;
    }
}
