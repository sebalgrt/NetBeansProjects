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
public final class Velero extends Barco {
    private Integer mastiles;

    public Velero() {
    }

    @Override
    public void crear() {
        Scanner leer = new Scanner(System.in);
        super.crear();
        System.out.print("Ingrese cantidadde mástiles: ");
        mastiles = leer.nextInt();
    }

    @Override
    public int modulo() {
        return super.modulo() + mastiles;
    }
    
    @Override
    public String toString() {
        System.out.print("Velero: ");
        super.toString();
        return "Mastiles: " + mastiles;
    }

}
