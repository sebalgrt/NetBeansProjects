/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Editorial;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Seba
 */
public class EditorialService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

    public Editorial crear() {
        Editorial nueva = new Editorial();
        try {
            System.out.print("Ingrese editorial: ");
            nueva.setNombre(leer.nextLine());
            em.getTransaction().begin();
            em.persist(nueva);
            em.getTransaction().commit();
            System.out.println("Editorial creada correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        return nueva;
    }

    public void borrar() {
        try {
            System.out.print("Ingrese ID de la editorial: ");
            int id = leer.nextInt();
            Editorial editorial = em.find(Editorial.class, id);
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
            System.out.println("Editorial borrada correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public Editorial modificar() {
        Editorial editorial = null;
        try {
            System.out.print("Ingrese ID de la editorial: ");
            int id = leer.nextInt();
            editorial = em.find(Editorial.class, id);
            System.out.print("Ingrese nueva editorial: ");
            editorial.setNombre(leer.next());
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
            System.out.println("La editorial se modificó correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        return editorial;
    }
    
}
