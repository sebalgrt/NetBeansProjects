/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class PersonaService {
        Scanner leer = new Scanner(System.in);
        Persona nueva = new Persona();
        
//Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona(){
        System.out.print("Ingrese nombre: ");
        nueva.setNombre(leer.nextLine());
        System.out.print("Ingrese año nacimiento (YYYY): ");
        int anio = leer.nextInt() - 1900;
        System.out.print("Ingrese mes de nacimiento (MM): ");
        int mes = leer.nextInt() - 1;
        System.out.print("Ingrese día de nacimiento (DD): ");
        int dia = leer.nextInt();
        Date fecha = new Date (anio, mes, dia);
        nueva.setNacimiento(fecha);
        return nueva;
    }
    
    // METODO PARA ACCEDER A LOS NOMBRES 
    public Persona mostrarNombre(PersonaService user) {
        user.nueva.getNombre();
        return nueva;
    }
    
//Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona crearPersona) {
        int act = new Date().getYear();
        int nac = crearPersona.getNacimiento().getYear();
        int edad = act - nac;
        System.out.println("La edad es " + edad + " años");
        return edad;
    }
    
//Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
    public boolean menorQue (Persona user1, Persona user2) {
        int edad1 = user1.getNacimiento().getYear();
        int edad2 = user2.getNacimiento().getYear();
        return edad1 < edad2;
    }

//Método mostrarPersona que muestra la información de la persona
//deseada.
    public void mostrarPersona(PersonaService user) {
        System.out.println("Nombre: " + user.nueva.getNombre());
        System.out.println("Fecha de nacimiento: " + user.nueva.getNacimiento().toString());
    }

    
}
