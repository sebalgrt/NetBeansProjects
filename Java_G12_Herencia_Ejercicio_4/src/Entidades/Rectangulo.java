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
public final class Rectangulo implements CalculosFormas {
    private Integer base;
    private Integer altura;
    
    @Override
    public void datos() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese base: ");
        base = leer.nextInt();
        System.out.print("Ingrese altura: ");
        altura = leer.nextInt();
    }
    
    @Override
    public void area() {
        System.out.println("El área del rectángulo es: " + base * altura);
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del rectángulo es: " + (base + altura) * 2);
    }

}
