/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class PersonaServicio {
    Persona nueva = new Persona();
    Scanner leer = new Scanner(System.in);
    
    public void crearPersona() {
        System.out.print("Ingrese nombre y apellido: ");
        nueva.setNombre(leer.nextLine());
        System.out.print("Ingrese edad: ");
        nueva.setEdad(leer.nextInt());
        String sex;
        do {
            System.out.print("Ingrese sexo (H/M/O): ");
            sex = leer.next();
            if (sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O")) {
                nueva.setSexo(sex);
            }else {
                System.out.println("Opción incorrecta");
            }
        } while (!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("O"));
        System.out.print("Ingrese altura (mts): ");
        nueva.setAltura(leer.nextDouble());
        System.out.print("Ingrese peso (kg): ");
        nueva.setPeso(leer.nextDouble());
    }
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (nueva.getEdad() > 18) {
            mayor = true;
        }
        return mayor;
    }
    
    public int calcularIMC() {
        double imc = nueva.getPeso()/Math.pow(nueva.getAltura(), 2);
        if (imc < 20) {
            return -1;
        }else if (imc >= 20 && imc <= 25 ) {
            return 0;
        }else {
            return 1;
        }
    }
}
