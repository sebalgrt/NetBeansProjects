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
public class Animal {
    protected String nombre;
    protected Integer edad;
    protected String sexo;

    public Animal() {
    }

    public Animal(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public void hacerRuido() {
        System.out.println("Hola!");
    }
}
