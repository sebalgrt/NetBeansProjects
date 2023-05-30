/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia10_colecciones_ejercicio_3;

import Servicios.AlumnoService;

/**
 *
 * @author Seba
 */
public class Java_Guia10_Colecciones_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService nuevo = new AlumnoService();
        nuevo.agregar();
        System.out.println("");
        nuevo.mostrar();
        System.out.println("");
        nuevo.buscar();
    }
    
}
