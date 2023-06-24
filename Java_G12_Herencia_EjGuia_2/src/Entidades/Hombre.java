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
public final class Hombre extends Persona implements Acciones {

    public Hombre() {
    }

    @Override
    public void saludo() {
        System.out.println("Kehace' loco!, Todo piola?");
    }

    @Override
    public void mandarAcagar() {
        System.out.println("Anda a cagar!!!");
    }
    
}
