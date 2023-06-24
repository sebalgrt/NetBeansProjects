/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Persona {
    private int espectador;
    private int edad;
    private int dinero;

    public Persona() {
    }

    public int getEspectador() {
        return espectador;
    }

    public void setEspectador(int espectador) {
        this.espectador = espectador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador: " + espectador + ", Edad: " + edad + ", $: " + dinero;
    }
    
//    METODOS
    
    public ArrayList<Persona> publico() {
        ArrayList<Persona> publico = new ArrayList();
        for (int i = 0; i < 47; i++) {
            Persona nueva = new Persona();
            nueva.espectador = i;
            nueva.edad = (int)(Math.random() * 60 + 10);
            nueva.dinero = (int)(Math.random() * 1000);
            publico.add(nueva);
        }
        return publico;
    }
    
    public void mostrarPublico(ArrayList<Persona> publico) {
        for (Persona persona : publico) {
            System.out.println(persona.toString());
        }
        System.out.println("");
    }
}
