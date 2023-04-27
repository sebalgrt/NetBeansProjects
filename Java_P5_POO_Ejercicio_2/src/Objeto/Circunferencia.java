/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }    
    
    public double getRadio() {
        return radio;
    }

public void crearCircunferencia(){
    this.setRadio(radio);
}

public double area() {
    double area = 3.14 * radio * radio;
    return area;
}
    
public double perimetro() {
    double per = 2 * 3.14 * radio;
    return per;
}

}



