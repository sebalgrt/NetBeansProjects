/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import DAO.ClienteDAO;
import DAO.LibroDAO;
import DAO.PrestamoDAO;
import java.util.Date;
import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Cliente;
import java_g16_jpa_ejercicio_libreria.Entidades.Libro;
import java_g16_jpa_ejercicio_libreria.Entidades.Prestamo;

/**
 *
 * @author Seba
 */
public class PrestamoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PrestamoDAO pdao = new PrestamoDAO();
    LibroDAO ldao = new LibroDAO();
    ClienteDAO cdao = new ClienteDAO();

    public void crear() {
        try {
            Date fecha;
            Libro libro;
            Cliente cliente;
            do {                
                System.out.print("Ingrese año de entrega (AAAA): ");
                int anio = leer.nextInt() - 1900;
                System.out.print("Ingrese mes de entrega (MM): ");
                int mes = leer.nextInt() - 1;
                System.out.print("Ingrese mes de entrega (DD): ");
                int dia = leer.nextInt();
                fecha = new Date(anio, mes,dia);
                System.out.print("Ingrese ISBN del libro: ");
                libro = ldao.buscarLibroISBN(leer.nextLong());
                System.out.print("Ingrese ID del cliente: ");
                cliente = cdao.buscarClienteId(leer.nextInt());
                if (fecha == null | libro == null | cliente == null) {
                    System.out.println("Datos nulos");
                }
            } while (fecha == null | libro == null | cliente == null);
            Prestamo prestamo = new Prestamo(fecha, libro, cliente);
            pdao.crear(prestamo);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        
    }

    public void devolucion() {
        try {
            System.out.print("Ingrese ID del prestamo: ");
            Prestamo prestamo = pdao.buscarPrestamoId(leer.nextInt());
            Date devol = new Date();    
            do {
                System.out.print("Ingrese año de devolución (AAAA): ");
                devol.setYear(leer.nextInt() - 1900);
                System.out.print("Ingrese mes de devolución (MM): ");
                devol.setMonth(leer.nextInt() - 1);
                System.out.print("Ingrese mes de devolución (DD): ");
                devol.setDate(leer.nextInt());
                if (prestamo.getEntrega().after(devol)) {
                    System.out.println("ERROR: Fecha de devolución anterior a la de entrega");
                }
            } while (prestamo.getEntrega().after(devol));
            prestamo.setDevolucion(devol);
            pdao.modificar(prestamo);
            System.out.println("Devolucion correcta");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void buscar() {
        try {
            System.out.print("Ingrese ID del prestamo: ");
            Prestamo p = pdao.buscarPrestamoId(leer.nextInt());
            System.out.println(p.getId() + "- Entregado: " + p.getEntrega() + 
                    " - Devuelto: " + p.getDevolucion() + " - Titulo:" +  p.getLibro().getTitulo()
            + " - Cliente: " + p.getCliente().getNombre());
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void borrar() {
         try {
            System.out.print("Ingrese ID del prestamo: ");
            Prestamo prestamo = pdao.buscarPrestamoId(leer.nextInt());
            pdao.borrar(prestamo);
             System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void modificar() {
        try {
            System.out.print("Ingrese ID del prestamo a modificar: ");
            Prestamo prestamo = pdao.buscarPrestamoId(leer.nextInt());
            Date entrega = prestamo.getEntrega();
            Date devolucion = prestamo.getDevolucion();
            Libro libro;
            Cliente cliente;
            do {                
                System.out.print("Ingrese nuevo año de entrega (AAAA): ");
                entrega.setYear(leer.nextInt()- 1900);
                System.out.print("Ingrese nuevo mes de entrega (MM): ");
                entrega.setMonth(leer.nextInt() - 1);
                System.out.print("Ingrese nuevo día de entrega (DD): ");
                entrega.setDate(leer.nextInt());
                prestamo.setEntrega(entrega);
                if (prestamo.getDevolucion() != null) {
                    System.out.print("Ingrese nuevo año de devolución (AAAA): ");
                    devolucion.setYear(leer.nextInt()- 1900);
                    System.out.print("Ingrese nuevo mes de devolución (MM): ");
                    devolucion.setMonth(leer.nextInt() - 1);
                    System.out.print("Ingrese nuevo día de devolución (DD): ");
                    devolucion.setDate(leer.nextInt());
                    prestamo.setDevolucion(devolucion);
                    }
                System.out.print("Ingrese nuevo ISBN del libro: ");
                libro = ldao.buscarLibroISBN(leer.nextLong());
                prestamo.setLibro(libro);
                System.out.print("Ingrese nuevo ID del cliente: ");
                cliente = cdao.buscarClienteId(leer.nextInt());
                prestamo.setCliente(cliente);
                if (entrega == null | libro == null | cliente == null) {
                    System.out.println("Datos nulos");
                }
            } while (entrega == null | libro == null | cliente == null);
            pdao.modificar(prestamo);
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }
    
}
