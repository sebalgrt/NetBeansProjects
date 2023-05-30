/*
 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. 
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada
 */
package java_guía10_colecciones_.ejercicio_1;

import Servicios.RazaService;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Java_Guía10_Colecciones_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RazaService nuevo = new RazaService();
        String resp;
        do {
            nuevo.agregar();
            System.out.print("Desea guardar otra raza? (S/N): ");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
        System.out.println("");
        nuevo.mostrar();
        System.out.println("");
        nuevo.eliminar();
        System.out.println("");
        nuevo.mostrar();

        
    }
}
