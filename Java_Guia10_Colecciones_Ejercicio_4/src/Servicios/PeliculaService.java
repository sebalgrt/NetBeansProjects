/*
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantall
 */
package Servicios;

import Entidades.Comparadores;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class PeliculaService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> videoteca = new ArrayList();

    public ArrayList agregar() {
        String conf;
        do {
            System.out.print("Ingrese título: ");
            String titulo = leer.next();
            System.out.print("Ingrese director: ");
            String director = leer.next();
            System.out.print("Ingrese duración (hs): ");
            Double duracion = leer.nextDouble();
            Pelicula nueva = new Pelicula(titulo, director, duracion);
            videoteca.add(nueva);
            System.out.print("Desea cargar otra pelicula? (S/N): ");
            conf = leer.next();
        } while (!conf.equalsIgnoreCase("n"));
        return videoteca;
    }

    public void mostrar(ArrayList inicio) {
        for (Object aux : inicio) {
            System.out.println(aux.toString());
        }
    }

    public ArrayList menoresDe1() {
        ArrayList<Pelicula> menoresDe1 = new ArrayList();
        for (Pelicula aux : videoteca) {
            if (aux.getDuracion() > 1) {
                menoresDe1.add(aux);
            }
        }
        return menoresDe1;
    }

    public ArrayList duracMaxaMin(ArrayList inicio) {
         Collections.sort(inicio, Comparadores.duracDescendente);
        return inicio;
    }

    public ArrayList duracMinaMax(ArrayList inicio) {
        Collections.sort(inicio, Comparadores.duracAscendente);
        return inicio;
    }

    public ArrayList porTitulo(ArrayList inicio) {
        Collections.sort(inicio, Comparadores.titulo);
        return inicio;
    }

    public ArrayList porDirector(ArrayList inicio) {
        Collections.sort(inicio, Comparadores.director);
        return inicio;
    }

}
