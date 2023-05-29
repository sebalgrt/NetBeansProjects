/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.
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
        nuevo.mostrar();
        nuevo.eliminar();
        nuevo.mostrar();
        nuevo.ordenar();
        nuevo.mostrar();
        
    }
}
