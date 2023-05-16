/*
 Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_5;

import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class Java_P7_POOUtilidades_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService user1 = new PersonaService();
        //user1.crearPersona();
        user1.calcularEdad(user1.crearPersona());
        //user1.mostrarPersona(user1);
        PersonaService user2 = new PersonaService();
        //user2.crearPersona();
        user2.calcularEdad(user2.crearPersona());
        //user2.mostrarPersona(user2);
        user1.menorQue(user1, user2);
        System.out.println(comp);
        if (comp == true) {
            System.out.println(user1.mostrarNombre(user1).getNombre() + " es mayor que " + user2.mostrarNombre(user2).getNombre());
        }else {
            System.out.println(user1.mostrarNombre(user1).getNombre() + " es menor que " + user2.mostrarNombre(user2).getNombre());
        }
        int op = 0;
        do {
            System.out.println("MOSTRAR DATOS: ");
            System.out.println("1- Usuario 1");
            System.out.println("2- Usuario 2");
            System.out.println("3- Salir");
            System.out.print("Ingrese opcíón: ");
            op = leer.nextInt();
            switch(op) {
                case 1: user1.mostrarPersona(user1);
                break;
                case 2: user2.mostrarPersona(user2);
                break;
                case 3: System.out.println("ADIOS!!!");
                break;
                default: System.out.println("Opción incorrecta");
            }
        } while (op != 3);
    }
}
