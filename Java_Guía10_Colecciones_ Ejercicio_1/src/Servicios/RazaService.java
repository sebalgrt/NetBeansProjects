/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class RazaService {
    Scanner leer = new Scanner(System.in);
    ArrayList<String> razas = new ArrayList();
    
    public void agregar() {
        Raza nueva = new Raza();
        System.out.print("Ingrese raza: ");
        nueva.setRaza(leer.next());
        razas.add(nueva.getRaza());
    }

    public void mostrar() {
        for (String raza : razas) {
            System.out.println(raza);
        }
    }

    public void eliminar() {
        Iterator<String> it = razas.iterator();
        System.out.print("Que raza desea eliminar?: ");
        String del = leer.next();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(del))
                it.remove();
        }
    }

    public void ordenar() {
        Collections.sort(razas);
    }
    
}
