/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

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

}


