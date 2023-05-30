/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> curso = new ArrayList();

    public void agregar() {
        String resp;
        do {
            System.out.print("Ingrese nombre: ");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota " + (i + 1) + ": ");
                notas.add(leer.nextInt());
            }
            Alumno nuevo = new Alumno(nombre, notas);
            curso.add(nuevo);
            System.out.print("Desea ingresar otro alumno? (S/N): ");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
        
    }

    public void mostrar() {
        Iterator it = curso.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public void buscar() {
        System.out.print("Ingrese alumno a buscar: ");
        String busq = leer.next();
        boolean conf = true;
        for (Alumno aux : curso) {
            if (aux.getNombre().equals(busq)) {
                System.out.println("El promedio de " + busq + " es: " + notaFinal(aux.getNotas()));
                conf = false;
            }
        }
        if (conf) {
            System.out.println(busq + " no está en la lista");
        }
    }

    public double notaFinal(ArrayList<Integer> notas) {
        int cont = 0;
        for (Integer aux : notas) {
            cont += aux;
        }
        double prom = cont / notas.size();
        return prom;
    }
}
