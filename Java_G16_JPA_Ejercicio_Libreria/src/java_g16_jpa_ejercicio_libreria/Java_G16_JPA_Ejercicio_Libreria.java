/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria;

import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Servicios.AutorService;
import java_g16_jpa_ejercicio_libreria.Servicios.ClienteService;
import java_g16_jpa_ejercicio_libreria.Servicios.EditorialService;
import java_g16_jpa_ejercicio_libreria.Servicios.LibroService;
import java_g16_jpa_ejercicio_libreria.Servicios.PrestamoService;

/**
 *
 * @author Seba
 */
public class Java_G16_JPA_Ejercicio_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        LibroService libro = new LibroService();
        AutorService autor = new AutorService();
        EditorialService editorial = new EditorialService();
        ClienteService cliente = new ClienteService();
        PrestamoService prestamo = new PrestamoService();
        
        int op = 0;
        do {
            System.out.println("LIBRERÍA - MENÚ");
            System.out.println("1- CREAR");
            System.out.println("2- BORRAR");
            System.out.println("3- MODIFICAR");
            System.out.println("4- BUSCAR");
            System.out.println("5- PRESTAMOS");
            System.out.println("6- SALIR");
            System.out.print("Elija una opción: ");
            try {    
                op = leer.nextInt();
                System.out.println("");
                switch(op) {
                    case 1:
                        System.out.println("1- Crear Libro");
                        System.out.println("2- Crear Autor");
                        System.out.println("3- Crear Editorial");
                        System.out.println("4- Crear Cliente");
                        System.out.println("5- Volver");
                        System.out.print("Elija opción: ");
                        int opc = leer.nextInt();
                        System.out.println("");
                        switch (opc) {
                            case 1:libro.crear();
                            break;
                            case 2: autor.crear();
                            break;
                            case 3: editorial.crear();
                            break;
                            case 4: cliente.crear();
                            break;
                            case 5: System.out.println("");
                            break;
                            default: System.out.println("Ingrese opción correcta");
                        }
                    break;
                    case 2:
                        System.out.println("1- Borrar Libro");
                        System.out.println("2- Borrar Autor");
                        System.out.println("3- Borrar Editorial");
                        System.out.println("4- Borrar Cliente");
                        System.out.println("5- Volver");
                        System.out.print("Elija opción: ");
                        int opb = leer.nextInt();
                        System.out.println("");
                        switch (opb) {
                            case 1: libro.borrar();
                            break;
                            case 2: autor.borrar();
                            break;
                            case 3: editorial.borrar();
                            break;
                            case 4: cliente.borrar();
                            break;
                            case 5: System.out.println("");
                            break;
                            default: System.out.println("Ingrese opción correcta");
                        }
                    break;
                    case 3:
                        System.out.println("1- Modificar Libro");
                        System.out.println("2- Modificar Autor");
                        System.out.println("3- Modificar Editorial");
                        System.out.println("4- Modificar Cliente");
                        System.out.println("5- Volver");
                        System.out.print("Elija opción: ");
                        int opm = leer.nextInt();
                        System.out.println("");
                        switch (opm) {
                            case 1: libro.modificar();
                            break;
                            case 2: autor.modificar();
                            break;
                            case 3: editorial.modificar();
                            break;
                            case 4: cliente.modificar();
                            break;
                            case 5: System.out.println("");
                            break;
                            default: System.out.println("Ingrese opción correcta");
                        }
                    break;
                    case 4:
                        System.out.println("1- Buscar Libro");
                        System.out.println("2- Buscar Autor");
                        System.out.println("3- Buscar Editorial");
                        System.out.println("4- Buscar Cliente");
                        System.out.println("5- Volver");
                        System.out.print("Elija opción: ");
                        int opf = leer.nextInt();
                        System.out.println("");
                        switch (opf) {
                            case 1: libro.buscar();
                            break;
                            case 2: autor.buscar();
                            break;
                            case 3: editorial.buscar();
                            break;
                            case 4: cliente.buscar();
                            break;
                            case 5: System.out.println("");
                            break;
                            default: System.out.println("Ingrese opción correcta");
                        }
                    break;
                    case 5:
                        System.out.println("1- Prestar libro: ");
                        System.out.println("2- Devolver libro: ");
                        System.out.println("3- Buscar prestamo: ");
                        System.out.println("4- Modificar prestamo: ");
                        System.out.println("5- Borrar prestamo: ");
                        System.out.print("Ingrese opción: ");
                        int opp = leer.nextInt();
                        switch (opp) {
                            case 1: prestamo.crear();
                            break;
                            case 2: prestamo.devolucion();
                            break;
                            case 3: prestamo.buscar();
                            break;
                            case 4: prestamo.modificar();
                            break;
                            case 5: prestamo.borrar();
                            break;
                            default: System.out.println("Ingrese opción correcta");
                        }
                    break;
                    case 6: System.out.println("ADIOS!!!");
                    break;
                    default: System.out.println("Ingrese opción correcta");
                }
            } catch (Exception e) {
                System.out.println("Error: dato invalido");
                leer.nextLine();
                System.out.println("");
            }
        } while (op != 6);
                
    }
    
}
