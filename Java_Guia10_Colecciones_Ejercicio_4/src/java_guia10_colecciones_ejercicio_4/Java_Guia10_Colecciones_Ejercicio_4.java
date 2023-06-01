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
package java_guia10_colecciones_ejercicio_4;

import Servicios.PeliculaService;
import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Java_Guia10_Colecciones_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService start = new PeliculaService();
        ArrayList inicio = start.agregar();
        System.out.println("");
        System.out.println("-= LISTA COMPLETA =-");
        start.mostrar(inicio);
        ArrayList menoresDe1 = start.menoresDe1();
        System.out.println("");
        System.out.println("-= DURACIÓN: MÁS DE 1 HORA =-");
        start.mostrar(menoresDe1);
        System.out.println("");
        System.out.println("-= ORDEN POR DURACIÓN: MAYOR A MENOR =-");
        ArrayList duracMaxaMin = start.duracMaxaMin(inicio);
        start.mostrar(duracMaxaMin);
        System.out.println("");
        System.out.println("-= ORDEN POR DURACIÓN: MENOR A MAYOR =-");
        ArrayList duracMinaMax = start.duracMinaMax(inicio);
        start.mostrar(duracMinaMax);
        System.out.println("");
        System.out.println("-= ORDEN POR TITULO =-");
        ArrayList porTitulo = start.porTitulo(inicio);
        start.mostrar(porTitulo);
        System.out.println("");
        System.out.println("-= ORDEN POR DIRECTOR =-");
        ArrayList porDirector = start.porDirector(inicio);
        start.mostrar(porDirector);
    }
    
}
