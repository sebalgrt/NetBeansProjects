/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;

/**
 *
 * @author Seba
 */
public class PersonaService {
    
    Persona nuevaPersona = new Persona("Seba", 42, 28102903);
    
    public void MostrarDatos(){
        System.out.println(nuevaPersona.getNombre());
        System.out.println(nuevaPersona.getEdad());
        System.out.println(nuevaPersona.getDni());
    }
}
