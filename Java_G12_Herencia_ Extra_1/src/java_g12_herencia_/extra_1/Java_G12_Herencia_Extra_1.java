/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g12_herencia_.extra_1;

import Entidades.Cliente;

/**
 *
 * @author Seba
 */
public class Java_G12_Herencia_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente nuevo = new Cliente();
        nuevo.crear();
        System.out.println(nuevo.toString());
        nuevo.alquiler();
    }
    
}
