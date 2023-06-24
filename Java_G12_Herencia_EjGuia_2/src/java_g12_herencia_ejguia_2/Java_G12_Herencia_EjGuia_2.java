/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g12_herencia_ejguia_2;

import Entidades.Hombre;
import Entidades.Persona;

/**
 *
 * @author Seba
 */
public class Java_G12_Herencia_EjGuia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona nueva = new Hombre();
        nueva.saludo();
        nueva.mandarAcagar();
    }
    
}
