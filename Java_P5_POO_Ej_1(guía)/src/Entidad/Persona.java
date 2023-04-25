/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Seba
 */
public class Persona {
    public String nombre;
    public Date nacimiento;
    public int documento;
    
    public Persona(){
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}


