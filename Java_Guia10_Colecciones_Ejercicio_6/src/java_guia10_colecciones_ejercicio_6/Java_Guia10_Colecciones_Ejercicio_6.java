/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package java_guia10_colecciones_ejercicio_6;

import Servicios.ProductoService;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Java_Guia10_Colecciones_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ProductoService tienda = new ProductoService();
        int op = 0;
        do {
        System.out.println("MENÚ: ");
        System.out.println("1- AGREGAR PRODUCTO");
        System.out.println("2- VER TIENDA");
        System.out.println("3- EDITAR PRECIO");
        System.out.println("4- ELIMINAR PRODUCTO");
        System.out.println("5- SALIR");
        System.out.print("Elija una opción: ");
        op = leer.nextInt();
        System.out.println("");
            switch(op) {
                case 1: tienda.agregar();
                break;
                case 2: tienda.mostrar();
                break;
                case 3: tienda.editar();
                break;
                case 4: tienda.eliminar();
                break;
                case 5: System.out.println("ADIOS!");
                break;
                default: System.out.println("Opción incorrecta");
            }
        } while (op != 5);

    }
    
}
