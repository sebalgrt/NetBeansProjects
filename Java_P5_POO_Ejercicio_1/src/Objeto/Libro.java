/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Libro {
    public int isbn;
    public String nombre;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(int isbn, String nombre, String autor, int paginas) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese titulo: ");
        this.nombre = leer.nextLine();
        System.out.print("Ingrese autor: ");
        this.autor = leer.nextLine();
        System.out.print("Ingrese ISBN: ");
        this.isbn = leer.nextInt();
        System.out.print("Ingrese cantidad de páginas: ");
        this.paginas = leer.nextInt();
    }
    
    public void mostrarLibro() {
        System.out.println("Titulo: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Cantidad de páginas: " + this.paginas);
    }
}


