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
public final class Yate extends AMotor {
    private Integer camarotes;

    public Yate() {
    }

    @Override
    public void crear() {
        Scanner leer = new Scanner(System.in);
        super.crear();
        System.out.print("Ingrese cantidad de camarotes: ");
        camarotes = leer.nextInt();
    }

    @Override
    public int modulo() {
        return super.modulo() + camarotes;
    }

    @Override
    public String toString() {
        System.out.print("Yate ");
        super.toString();
        return "Camarotes: " + camarotes;
    }
    
}
