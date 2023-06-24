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
public class Cine {
    private String pelicula;
    private int entrada;
    private int apt;

    public Cine() {
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }

    @Override
    public String toString() {
        return "Pelicula: " + pelicula + ", Valor $:" + entrada + ", " + apt;
    }
    
//    METRODOS
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cine pelicula() {
        Cine film = new Cine();
        System.out.print("Ingrese nombre de la pelicula: ");
        film.pelicula = leer.next();
        System.out.print("Ingrese valor de la entrada: ");
        film.entrada = leer.nextInt();
        System.out.print("Apta para mayores de: ");
        film.apt = leer.nextInt();
        return film;
    }
}
