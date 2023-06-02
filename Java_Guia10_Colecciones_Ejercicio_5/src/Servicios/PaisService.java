/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Comparadores;
import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class PaisService {
    Scanner leer = new Scanner(System.in);
    HashSet<Pais> planeta = new HashSet();

    public HashSet agregar() {
        String conf;
        do {
            System.out.print("Ingrese país: ");
            String nombre = leer.next();
            Pais nuevo = new Pais(nombre);
            planeta.add(nuevo);
            System.out.print("Desea ingresar otro país? (S/N): ");
            conf = leer.next();
        } while (!conf.equalsIgnoreCase("n"));
        System.out.println("");
        return planeta;
    }

    public void mostrar(HashSet planeta) {
        for (Object aux : planeta) {
            System.out.println(aux.toString());
        }
        System.out.println("");
    }

    public void ordenar(HashSet start) {
        ArrayList<Pais> aux = new ArrayList(start);
        Collections.sort(aux, Comparadores.alfab);
        for (Pais pais : aux) {
            System.out.println(pais.toString());
        }
        System.out.println("");
    }

    public HashSet eliminar(HashSet start) {
        System.out.print("Ingrese país a eliminar: ");
        String del = leer.next();
        boolean chk = true;
        Iterator<Pais> it = start.iterator();
        while (it.hasNext()) {            
            if (it.next().getNombre().equals(del)) {
                it.remove();
                System.out.println(del + " fue eliminado del conjunto");
                chk = false;
            }
        }
        if (chk) {
            System.out.println(del + " no está en el conjunto");
        }
        System.out.println("");
        return start;
    }
}
