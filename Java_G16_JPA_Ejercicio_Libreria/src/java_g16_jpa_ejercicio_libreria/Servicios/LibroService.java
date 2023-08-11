/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import DAO.LibroDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Autor;
import java_g16_jpa_ejercicio_libreria.Entidades.Editorial;
import java_g16_jpa_ejercicio_libreria.Entidades.Libro;

/**
 *
 * @author Seba
 */
public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    LibroDAO ldao = new LibroDAO();
    AutorService autorS = new AutorService();
    EditorialService editorialS = new EditorialService();
    List<Libro> libros = new ArrayList();

    public void crear() {
        try {
            System.out.print("Ingrese titulo: ");
            String titulo = leer.next();
            System.out.print("Ingrese año: ");
            Integer anio = leer.nextInt();
            System.out.print("Ingrese cantidad de ejemplares: ");
            Integer ejemp = leer.nextInt();
            Autor autor = autorS.crear();
            Editorial editorial = editorialS.crear();
            Libro libro = new Libro(titulo, anio, ejemp, autor, editorial);
            ldao.crear(libro);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void borrar() {
        try {
            System.out.print("Ingrese ISBN del libro a borrar: ");
            long id = leer.nextLong();
            Libro libro = ldao.buscarLibroISBN(id);
            ldao.borrar(libro);
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
            Libro libro = ldao.buscarLibroISBN(isbn);
            System.out.print("Ingrese nuevo titulo: ");
            libro.setTitulo(leer.next());
            System.out.print("Ingrese nuevo año: ");
            libro.setAnio(leer.nextInt());
            System.out.print("Ingrese nueva cantidad de ejemplares: ");
            libro.setEjemplares(leer.nextInt());
            Autor autor = autorS.modificar();
            libro.setAutor(autor);
            Editorial editorial = editorialS.modificar();
            libro.setEditorial(editorial);
            ldao.modificar(libro);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        
    }
    
    public void buscar() {
         try {
            System.out.println("1- Buscar por ISBN");
            System.out.println("2- Buscar por nombre");
            System.out.println("3- Mostrar todos");
            System.out.print("Ingrese opción: ");
            int op = leer.nextInt();
            switch (op) {
                case 1: 
                    System.out.print("Ingrese ISBN: ");
                    Libro libro = ldao.buscarLibroISBN(leer.nextLong());
                    System.out.println(libro.getIsbn() + " - " + libro.getTitulo() + 
                            " - " + libro.getAutor().getNombre() + " - " + 
                            libro.getEditorial().getNombre());
                    break;
                case 2:
                    System.out.print("Ingrese nombre (o parte): ");
                    libros = ldao.buscarLibroNombre(leer.next());
                    for (Libro aux : libros) {
                        System.out.println(aux.getIsbn() + " - " + aux.getTitulo() + 
                            " - " + aux.getAutor().getNombre() + " - " + 
                            aux.getEditorial().getNombre());
                    }
                    break;
                case 3:
                    libros = ldao.mostrarLibros();
                    for (Libro aux : libros) {
                        System.out.println(aux.getIsbn() + " - " + aux.getTitulo() + 
                            " - " + aux.getAutor().getNombre() + " - " + 
                            aux.getEditorial().getNombre());
                    }
                    break;
             }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            System.out.println(e);
            leer.nextLine();
        }
    }

}
