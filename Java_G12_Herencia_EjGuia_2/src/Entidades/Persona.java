/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public abstract class Persona implements Acciones {
    protected String nombre;
    protected Double altura;
    protected Double peso;
    protected Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Double altura, Double peso, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }
    
}
