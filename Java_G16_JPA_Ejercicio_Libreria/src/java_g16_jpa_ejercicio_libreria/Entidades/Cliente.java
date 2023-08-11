/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Seba
 */
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long dni;
    private String nombre;
    private String apellido;
    private String tel;

    public Cliente() {
    }

    public Cliente(Long dni, String nombre, String apellido, String tel) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public Long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTel() {
        return tel;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
