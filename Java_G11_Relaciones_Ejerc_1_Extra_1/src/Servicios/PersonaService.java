/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList crear(ArrayList perros) {
        PerroService perro = new PerroService();
        ArrayList<Persona> personas = new ArrayList();
        System.out.println("INGRESAR PERSONAS: ");
        String out;
        do {
            Persona nueva = new Persona();
            System.out.print("Ingrese nombre: ");
            nueva.setNombre(leer.next());
            System.out.print("Ingrese apellido: ");
            nueva.setApellido(leer.next());
            System.out.print("Ingrese edad: ");
            nueva.setEdad(leer.nextInt());
            System.out.print("Ingrese DNI: ");
            nueva.setDni(leer.nextLong());
            Perro elegido = perro.buecarYelegir(perros);
            nueva.setPerro(elegido);
            personas.add(nueva);
            System.out.print("Desea ingresar otra persona? (S/N): ");
            out = leer.next();
        } while (!out.equalsIgnoreCase("n"));
        System.out.println("");
        return personas;
    }

    public void mostrar(ArrayList personas) {
        for (Object aux : personas) {
            System.out.println(aux.toString());
        }
        System.out.println("");
    }

}
