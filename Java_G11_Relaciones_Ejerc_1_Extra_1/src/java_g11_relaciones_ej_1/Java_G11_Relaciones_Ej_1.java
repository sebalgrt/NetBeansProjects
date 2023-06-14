/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g11_relaciones_ej_1;

import Servicios.PerroService;
import Servicios.PersonaService;
import java.util.ArrayList;



/**
 *
 * @author Seba
 */
public class Java_G11_Relaciones_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService nueva = new PersonaService();
        PerroService nuevo = new PerroService();
        ArrayList perros = nuevo.crear();
        ArrayList personas = nueva.crear(perros);
        nueva.mostrar(personas);
        
        
        
//        CODIGO DEL EJERCICIO 1

//        nuevo.mostrar(perros);
//        Persona persona0 = (Persona) personas.get(0);
//        persona0.setPerro((Perro) perros.get(1));
//        Persona persona1 = (Persona) personas.get(1);
//        persona1.setPerro((Perro) perros.get(0));
//        nueva.mostrar(personas);
    }
    
}
