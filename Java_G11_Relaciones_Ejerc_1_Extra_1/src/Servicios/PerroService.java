/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class PerroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Perro> crear() {
        ArrayList<Perro> perros = new ArrayList();
        System.out.println("INGRESAR PERROS: ");
        String out;
        do {
            Perro nuevo = new Perro();
            System.out.print("Ingrese nombre: ");
            nuevo.setNombre(leer.next());
            System.out.print("Ingrese raza: ");
            nuevo.setRaza(leer.next());
            System.out.print("Ingrese edad: ");
            nuevo.setEdad(leer.nextInt());
            System.out.print("Ingrese tamaño: ");
            nuevo.setTamano(leer.next());
            perros.add(nuevo);
            System.out.print("Desea ingresar un nuevo perro? (S/N): ");
            out = leer.next();
        } while (!out.equalsIgnoreCase("n"));
        System.out.println("");
        return perros;
    }

    public Perro buecarYelegir(ArrayList perros) {
        Iterator<Perro> it = perros.iterator();
        System.out.println("");
        System.out.println("PERROS DISPONIBLES: ");
        while (it.hasNext()) {
            Perro next = it.next();
            if (next.isDisp()) {
                System.out.println(next.getNombre());
            }
        }
        
            System.out.println("");
            System.out.print("Cual te gusta?: ");
            String eleg = leer.next();
            Iterator<Perro> busc = perros.iterator();
            Perro salida = null;
            boolean chk = true;
            while (busc.hasNext()) {
                Perro perro = busc.next();
                if (perro.getNombre().equalsIgnoreCase(eleg)) {
                    salida = perro;
                    perro.setDisp(false);
                    chk = false;
                    System.out.println(eleg + " es tuyo!");
                }
            }
            if (chk) {
                System.out.println(eleg + " no está en la lista");
            }
        return salida;
    }
    
}
