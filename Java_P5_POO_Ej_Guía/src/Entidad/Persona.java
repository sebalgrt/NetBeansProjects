/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author recepcal
 */
public class Persona {
    String nombre;
    int nacimiento;
    int dni;

public Persona() {
}

private Persona(String nombre, int nacimiento, int dni) {
    this.nombre = nombre;
    this.nacimiento = nacimiento;
    this.dni = dni;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setNacimiento(int nacimiento) {
    this.nacimiento = nacimiento;
}

public void setDni(int dni) {
    this.dni = dni;
}

public String getNombre() {
    return nombre;
}

public int getNacimiento() {
    return nacimiento;
}

public int getDni() {
    return dni;
}


    
}
