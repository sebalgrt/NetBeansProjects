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
public class Perro extends Animal {
    private String raza;

    public Perro() {
    }

    public Perro(String raza, String nombre, Integer edad, String sexo) {
        super(nombre, edad, sexo);
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau!");
    }
    
}
