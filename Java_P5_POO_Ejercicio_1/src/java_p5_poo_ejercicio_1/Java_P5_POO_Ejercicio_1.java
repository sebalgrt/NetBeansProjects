/*
 Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.

 */
package java_p5_poo_ejercicio_1;

import Objeto.Libro;
import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Java_P5_POO_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INSTACIACION CONSTRUCTOR VACIO
        Libro libroVacio = new Libro();
        
        //INSTANCIACION CONSTRUCTOR POR PARAMENTROS
        Libro libroParametros = new Libro(123456, "El Cuco", "Seba", 48);
        
        //MOSTRAR DATOS
        libroParametros.mostrarLibro();
        
        //INSTANCIACIÓN CARGA POR TECLADO        
        libroVacio.cargarLibro();
        
        //MOSTRAR DATOS
        libroVacio.mostrarLibro();
        
        

    }
    
}
