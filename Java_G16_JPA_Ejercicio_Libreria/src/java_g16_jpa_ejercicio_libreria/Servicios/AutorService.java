/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

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
    
    public Autor crear() {
        Autor nuevo = new Autor();
        try {
            System.out.print("Ingrese autor: ");
            nuevo.setNombre(leer.nextLine());
            em.getTransaction().begin();
            em.persist(nuevo);
            em.getTransaction().commit();
            System.out.println("Autor creado correctamente");
            System.out.println("");
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
    
}
