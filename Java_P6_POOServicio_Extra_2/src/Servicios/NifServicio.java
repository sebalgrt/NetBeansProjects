/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class NifServicio {
    Scanner leer = new Scanner(System.in);
    Nif nuevo = new Nif();
    
    public void crearNif() {
        System.out.print("Ingrese DNI: ");
        nuevo.setDni(leer.nextLong());
        int letra = Math.round(nuevo.getDni() % 23);
        char vector[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        nuevo.setUnif(vector[letra]);
    }
    
    public void mostrar() {
        System.out.println("NIF: " + nuevo.getDni() + "-" + nuevo.getUnif());
    }
    
    
}
