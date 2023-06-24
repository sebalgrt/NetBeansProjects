/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g12_herencia_ejguia_1;

import Entidades.Gato;
import Entidades.Perro;
import Entidades.Animal;
import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Java_G12_Herencia_EjGuia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> entidades = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        entidades.add(a);
        entidades.add(b);
        entidades.add(c);
        
        for (Animal aux : entidades) {
            aux.hacerRuido();
        }
    }
    
}
