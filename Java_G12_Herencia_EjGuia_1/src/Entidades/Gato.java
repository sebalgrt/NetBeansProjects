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
public class Gato extends Animal {
    private String color;

    public Gato() {
    }

    public Gato(String color, String nombre, Integer edad, String sexo) {
        super(nombre, edad, sexo);
        this.color = color;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }
    
}
