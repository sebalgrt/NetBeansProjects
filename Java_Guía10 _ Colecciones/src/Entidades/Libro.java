/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Libro {
    private String nombre;

    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

    public void agregar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        this.nombre = leer.next();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
    
    
}
