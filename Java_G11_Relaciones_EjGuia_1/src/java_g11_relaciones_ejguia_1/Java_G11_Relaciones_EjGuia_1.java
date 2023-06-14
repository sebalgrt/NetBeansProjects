/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre,
apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la serie
(carácter) y número. Prueba acceder luego a los atributos del dni de la persona 
creando objetos y jugando desde el main
 */
package java_g11_relaciones_ejguia_1;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Java_G11_Relaciones_EjGuia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p1 = new Persona();
        System.out.print("Ingrese nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese apellido: ");
        p1.setApellido(leer.next());
        Dni dni = new Dni();
        System.out.print("Ingrese letra de serie: ");
        dni.setSerie(leer.next().charAt(0));
        System.out.print("Ingrese número: ");
        dni.setNumero(leer.nextLong());
        p1.setDni(dni);
        System.out.println("");
        System.out.print(p1.toString());
        System.out.println("");
        
    }
    
}
