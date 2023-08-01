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
import java_g16_jpa_ejercicio_libreria.Entidades.Editorial;
import java_g16_jpa_ejercicio_libreria.Entidades.Libro;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Seba
 */
public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    AutorService autorS = new AutorService();
    EditorialService editorialS = new EditorialService();
    List<Libro> libros = new ArrayList();

    public void crear() {
        try {
            System.out.print("Ingrese titulo: ");
            String titulo = leer.next();
            libros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :tit")
                        .setParameter("tit", titulo).getResultList();
            if (libros.size() == 0) {
                System.out.print("Ingrese año: ");
                Integer anio = leer.nextInt();
                System.out.print("Ingrese cantidad de ejemplares: ");
                Integer ejemp = leer.nextInt();
                Autor autor = autorS.crear();
                Editorial editorial = editorialS.crear();
                Libro libro = new Libro(titulo, anio, ejemp, autor, editorial);
                em.getTransaction().begin();
                em.persist(libro);
                em.getTransaction().commit();
                System.out.println("Libro creado correctamente");
                System.out.println("");
            } else {
                System.out.println("El titulo ya está creado");
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void borrar() {
        try {
            System.out.print("Ingrese ISBN del libro a borrar: ");
            long id = leer.nextLong();
            Libro libro = em.find(Libro.class, id);
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
            System.out.println("Libro borrado correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void modificar() {
        try {
            System.out.print("Ingrese ISBN del libro a modificar: ");
            long isbn = leer.nextLong();
            Libro libro = em.find(Libro.class, isbn);
            System.out.print("Ingrese titulo: ");
            libro.setTitulo(leer.next());
            System.out.print("Ingrese año: ");
            libro.setAnio(leer.nextInt());
            System.out.print("Ingrese cantidad de ejemplares: ");
            libro.setEjemplares(leer.nextInt());
            Autor autor = autorS.modificar();
            libro.setAutor(autor);
            Editorial editorial = editorialS.modificar();
            libro.setEditorial(editorial);
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
            System.out.println("El libro se modificó correctamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        
    }

    public void buscar() {
        try {
            System.out.print("Ingrese titulo a buscar o * para ver todo: ");
            String buscar = leer.next();
            if (buscar.equalsIgnoreCase("*")) {
                libros = em.createQuery("SELECT a FROM Libro a").getResultList();
            } else {
                buscar = "%" + buscar + "%";
                libros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :tit")
                        .setParameter("tit", buscar).getResultList();
            }
            for (Libro aux : libros) {
                System.out.println(aux.getIsbn() + " " + aux.getTitulo() + " " + 
                        aux.getAutor().getNombre() + " " + aux.getEditorial().getNombre());
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            System.out.println(e);
            leer.nextLine();
        }
    }
    
}
