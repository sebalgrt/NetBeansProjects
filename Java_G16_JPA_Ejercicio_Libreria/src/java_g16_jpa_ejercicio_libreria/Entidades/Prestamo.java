/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Seba
 */
@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE) 
    private Date entrega;
    @Temporal(TemporalType.DATE)
    private Date devolucion;
    @OneToOne
    private Libro libro;
    @OneToOne
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Date entrega,Libro libro, Cliente cliente) {
        this.entrega = entrega;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public Date getEntrega() {
        return entrega;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
