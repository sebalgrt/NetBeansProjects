/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_p6_pooservivio_ejercicio_guia;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Seba
 */
public class Java_P6_POOServivio_Ejercicio_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService personaServicio = new PersonaService();
        personaServicio.MostrarDatos();
    }
    
}
