/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Seba
 */
public class ProductoService {
    public void menu() {
        Scanner leer = new Scanner(System.in);
        try {
            char op;
            do {
                System.out.println("TIENDA MENÚ");
                System.out.println("A- Nombre de todos los productos");
                System.out.println("B- Nombre y precio de todos los productos");
                System.out.println("C- Productos entre $120 y $202.");
                System.out.println("D- Productos portátiles");
                System.out.println("E- Nombre y precio producto mas barato");
                System.out.println("F- Ingresar producto");
                System.out.println("G- Ingresar fabricante");
                System.out.println("H- Editar producto");
                System.out.println("I- SALIR");
                System.out.print("Ingrese una opcion: ");
                op = leer.next().toUpperCase().charAt(0);
                System.out.println("");
                switch (op) {
                    case 'A': 
                    break;
                    case 'B':
                    break;
                    case 'C':
                    break;
                    case 'D':
                    break;
                    case 'E':
                    break;
                    case 'F':
                    break;
                    case 'G':
                    break;
                    case 'H':
                    break;
                    case 'I': System.out.println("ADIOS!!!");
                    break;
                    default: System.out.println("Opción incorrecta");
                }
            } while (op != 'I');
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
