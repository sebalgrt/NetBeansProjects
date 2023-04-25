/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner leer = new Scanner(System.in);
        
        //INSTACIACION CONSTRUCTOR VACIO
        Libro libroVacio = new Libro();
        
        //INSTANCIACION CONSTRUCTOR POR PARAMENTROS
        Libro libroParametros = new Libro(123456, "El Cuco", "Seba", 48);
        
        //INSTANCIACIÓN A PEDIDO
        Libro libroUser = new Libro();
        System.out.print("Ingrese número ISBN: ");
        libroUser.isbn = leer.nextInt();
        System.out.print("Ingrese titulo; ");
        libroUser.nombre = leer.next();
        System.out.print("Ingrese autor: ");
        libroUser.autor = leer.next();
        System.out.print("Ingrese cantidad de paginas: ");
        libroUser.paginas = leer.nextInt();
        System.out.println("POR PARAMETROS");
        System.out.println("ISBN: " + libroParametros.isbn);
        System.out.println("Titulo: " + libroParametros.nombre);
        System.out.println("Autor: " + libroParametros.autor);
        System.out.println("Cantidad de páginas: " + libroParametros.paginas);
        System.out.println("");
        System.out.println("POR TECLADO");
        System.out.println("ISBN: " + libroUser.isbn);
        System.out.println("Titulo: " + libroUser.nombre);
        System.out.println("Autor: " + libroUser.autor);
        System.out.println("Cantidad de páginas: " + libroUser.paginas);
    }
    
}
