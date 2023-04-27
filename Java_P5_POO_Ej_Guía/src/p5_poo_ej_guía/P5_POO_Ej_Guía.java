/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_poo_ej_guía;

import Entidad.Persona;

/**
 *
 * @author recepcal
 */
public class P5_POO_Ej_Guía {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciación constructor vacío
        Persona per1 = new Persona();
        
        //Instanciación constructor por paramentros
//        Persona per2 = new Persona("Seba", 05/05/1980, 28102903);
        
        
        
        Persona per3 = new Persona();
        per3.setNombre("Lichi");
        per3.setNacimiento(23/04/2014);
        per3.setDni(53995610);
        System.out.println(per3.getNombre());
        System.out.println(per3.getNacimiento());
        System.out.println(per3.getDni());
    }
    
}
