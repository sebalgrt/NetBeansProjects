/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import DAO.EditorialDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Editorial;

/**
 *
 * @author Seba
 */
public class EditorialService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EditorialDAO edao = new EditorialDAO();
    List<Editorial> editoriales = new ArrayList();

    public Editorial crear() {
        Editorial nueva = new Editorial();
        try {
            System.out.print("Ingrese editorial: ");
            String nombre = leer.next();
            nueva.setNombre(nombre);
            edao.crear(nueva);
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
            Editorial editorial = edao.buscarEditorialID(id);
            edao.borrar(editorial);
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
            editorial = edao.buscarEditorialID(id);
            System.out.print("Ingrese nueva editorial: ");
            editorial.setNombre(leer.next());
            edao.modificar(editorial);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
        return editorial;
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
                    Editorial editorial = edao.buscarEditorialID(leer.nextInt());
                    System.out.println(editorial.getId() + " - " + editorial.getNombre());
                    break;
                case 2:
                    System.out.print("Ingrese nombre (o parte): ");
                    editoriales = edao.buscarEditorialNombre(leer.next());
                    for (Editorial aux : editoriales) {
                        System.out.println(aux.getId() + " - " + aux.getNombre());
                    }
                    break;
                case 3:
                    editoriales = edao.mostrarEditoriales();
                    for (Editorial aux : editoriales) {
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
