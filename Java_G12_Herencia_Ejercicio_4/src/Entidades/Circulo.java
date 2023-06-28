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
public final class Circulo implements CalculosFormas {
    private double radio;
    
    @Override
    public void datos() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese radio: ");
        radio = leer.nextDouble();
    }
    
    @Override
    public void area() {
        System.out.println("El área del círculo es: " + 3.14 * radio * radio);
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del círculo es: " + 3.14 * 2 * radio);
    }

}
