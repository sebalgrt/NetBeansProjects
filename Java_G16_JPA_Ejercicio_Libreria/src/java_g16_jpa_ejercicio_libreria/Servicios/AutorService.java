/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Autor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Seba
 */
public class AutorService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    List<Autor> autores = new ArrayList();
    
    public Autor crear() {
        Autor nuevo = new Autor();
        try {
            System.out.print("Ingrese autor: ");
            String nombre = leer.next();
            nuevo.setNombre(nombre);
            autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom")
                        .setParameter("nom", nombre).getResultList();
            if (autores.size() == 0) {
                em.getTransaction().begin();
                em.persist(nuevo);
                em.getTransaction().commit();
                System.out.println("Autor creado correctamente");
                System.out.println("");
            } else {
                System.out.println("Autor existente");
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        return nuevo;
    }

    public void borrar() {
        try {
            System.out.print("Ingrese ID del autor: ");
            int id = leer.nextInt();
            Autor autor = em.find(Autor.class, id);
            em.getTransaction().begin();
            em.remove(autor);
            em.getTransaction().commit();
            System.out.println("Autor borrado correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public Autor modificar() {
        Autor autor = null;
        try {
            System.out.print("Ingrese ID del autor: ");
            int id = leer.nextInt();
            autor = em.find(Autor.class, id);
            System.out.print("Ingrese nuevo autor: ");
            autor.setNombre(leer.next());
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
            System.out.println("El autor se modificó correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        return autor;
    }

    public void buscar() {
         try {
            System.out.print("Ingrese autor a buscar o * para ver todos: ");
            String buscar = leer.next();
            if (buscar.equalsIgnoreCase("*")) {
                autores = em.createQuery("SELECT a FROM Autor a").getResultList();
            } else {
                buscar = "%" + buscar + "%";
                autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom")
                        .setParameter("nom", buscar).getResultList();
            }
            for (Autor aux : autores) {
                System.out.println(aux.getId() + " " + aux.getNombre());
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            System.out.println(e);
            leer.nextLine();
        }
    }
    
}
