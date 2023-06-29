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
public class AMotor extends Barco {
    private Integer potencia;

    public AMotor() {
    }

    @Override
    public void crear() {
        Scanner leer = new Scanner(System.in);
        super.crear();
        System.out.print("Ingrese potecia del motor CV: ");
        potencia = leer.nextInt();
    }

    @Override
    public int modulo() {
        return super.modulo() + potencia;
    }
    
    @Override
    public String toString() {
        System.out.print("Barco: ");
        super.toString();
        return "Potencia CV: " + potencia;
    }
}
