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
public final class Polideportivo extends Edificio {
    private String nombre;
    private boolean techo;

    public boolean isTecho() {
        return techo;
    }
    
    @Override
    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = leer.next();
        super.crear();
        System.out.print("Tiene techo? (S/N): ");
        String r = leer.next();
        if (r.equalsIgnoreCase("s")) {
            techo = true;
        }else {
            techo = false;
        }
    }

    @Override
    public int calcularVolumen() {
        int resp = super.calcularVolumen();
        System.out.println("El volumen es: " + resp);
        return resp;
    }

    @Override
    public int calcularSuperficie() {
        int resp = super.calcularSuperficie();
        System.out.println("La superficie es de: " + resp);
        return resp;
    }

    
}
