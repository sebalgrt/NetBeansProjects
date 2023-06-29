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
public abstract class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer modelo;

    public Barco() {
    }
   
    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese matricula: ");
        matricula = leer.next();
        System.out.print("Ingrese eslora: ");
        eslora = leer.nextInt();
        System.out.print("Ingrese modelo/año: ");
        modelo = leer.nextInt();
    }
    
    public int modulo() {
        return eslora * 10;
    }

    @Override
    public String toString() {
        return "Matric: " + matricula + "| Esl: " + eslora + "| Modelo: " + modelo;
    }
    
}
