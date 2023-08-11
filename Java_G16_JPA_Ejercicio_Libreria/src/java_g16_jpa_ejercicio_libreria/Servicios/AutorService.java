/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import DAO.AutorDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Autor;

/**
 *
 * @author Seba
 */
public class AutorService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorDAO adao = new AutorDAO();
    List<Autor> autores = new ArrayList();
    
    public Autor crear() {
        Autor nuevo = new Autor();
        try {
            System.out.print("Ingrese autor: ");
            String nombre = leer.next();
            nuevo.setNombre(nombre);
            adao.crear(nuevo);
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
            Autor autor = adao.buscarAutorID(id);
            adao.borrar(autor);
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
            autor = adao.buscarAutorID(id);
            System.out.print("Ingrese nuevo autor: ");
            autor.setNombre(leer.next());
            adao.modificar(autor);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        return autor;
    }

    public void buscar() {
         try {
            System.out.println("1- Buscar por ID");
            System.out.println("2- Buscar por nombre");
            System.out.println("3- Mostrar todos");
            System.out.print("Ingrese opción: ");
            int op = leer.nextInt();
            switch (op) {
                case 1: 
                    System.out.print("Ingrese ID: ");
                    Autor autor = adao.buscarAutorID(leer.nextInt());
                    System.out.println(autor.getId() + " - " + autor.getNombre());
                    break;
                case 2:
                    System.out.print("Ingrese nombre (o parte): ");
                    autores = adao.buscarAutorNombre(leer.next());
                    for (Autor aux : autores) {
                        System.out.println(aux.getId() + " - " + aux.getNombre());
                    }
                    break;
                case 3:
                    autores = adao.mostrarAutores();
                    for (Autor aux : autores) {
                        System.out.println(aux.getId() + " - " + aux.getNombre());
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
