/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author recepcal
 */
public class ParDeNumerosServicio {
    ParDeNumeros par = new ParDeNumeros();
    
//Método mostrarValores que muestra cuáles son los dos números
//guardados
    public void mostrarValores() {
        System.out.println("Número 1: " + par.getN1());
        System.out.println("Número 2: " + par.getN2());
    }
    
//Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
    public double devolverMayor() {
        double mayor;
        if (par.getN1() > par.getN2()) {
            mayor = par.getN1();
        }else {
             mayor = par.getN2();
        }
        return mayor;
    }
    
//Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    public void calcularPotencia() {
        int num1 = (int) Math.round(par.getN1());
        int num2 = (int) Math.round(par.getN2());
        int pot = Integer.compare(num1, num2);
        if (pot == -1) {
            System.out.println(num2 + " a la " + num1 + " = " + Math.pow(num2, num1));
        }else {
            System.out.println(num1 + " a la " + num2 + " = " + Math.pow(num1, num2));
        }
    }
    
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
    public void calculaRaiz() {
        int num1 = (int) Math.abs(par.getN1());
        int num2 = (int) Math.abs(par.getN2());
        int men = Integer.compare(num1, num2);
        if (men == -1) {
            System.out.println("La raiz cuadrada de " +  num1 + " = " + Math.sqrt(num1));
        }else {
            System.out.println("La raiz cuadrada de " +  num2 + " = " + Math.sqrt(num2));
        }
    }
}
