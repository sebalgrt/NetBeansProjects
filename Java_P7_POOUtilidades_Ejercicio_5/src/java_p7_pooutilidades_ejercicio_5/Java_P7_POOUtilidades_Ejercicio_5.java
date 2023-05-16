/*
 Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_5;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author Seba
 */
public class Java_P7_POOUtilidades_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService nueva = new PersonaService();
        //CREA PERSONA 1 CON SERVICIO CREARPERSONA
        Persona user1 = nueva.crearPersona();
        //CALCULA EDAD
        System.out.println("Tiene " + nueva.calcularEdad(user1) + " años");
        //CREA PERSONA 2 CON EL MISMO SERVICIO
        Persona user2 = nueva.crearPersona();
        //CALCULA EDAD
        System.out.println("Tiene " + nueva.calcularEdad(user2) + " años");
        //COMPARA
        if (nueva.menorQue(user1, user2) == true) {
            System.out.println(user2.getNombre() + " es menor que " + user1.getNombre());
        }else {
            System.out.println(user2.getNombre() + " es mayor que " + user1.getNombre());
        }
        //MUESTRA
        nueva.mostrarPersona(user1);
        nueva.mostrarPersona(user2);
    }
}
