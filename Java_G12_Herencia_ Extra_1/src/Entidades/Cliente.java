/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public final class Cliente {
    private String nombre;
    private Integer dni;
    private Date checkin;
    private Date checkout;
    private Integer posicion;
    private Barco barco;

    public Cliente() {
    }


    @Override
    public String toString() {
        return "Cliente " + nombre + ": DNI: " + dni + ", CheckIn: " + checkin + ", CheckOut: " + checkout + ", Posición: " + posicion + ", " + barco;
    }
     
    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese DNI: ");
        dni = leer.nextInt();
        System.out.println("CHECK IN:");
        System.out.print("Ingrese año: ");
        int anio = leer.nextInt() - 1900;
        System.out.print("Ingrese mes: ");
        int mes = leer.nextInt() - 1;
        System.out.print("Ingrese día: ");
        int dia = leer.nextInt();
        checkin = new Date(anio, mes, dia);
        System.out.println("CHECK OUT:");
        System.out.print("Ingrese año: ");
        anio = leer.nextInt() - 1900;
        System.out.print("Ingrese mes: ");
        mes = leer.nextInt() - 1;
        System.out.print("Ingrese día: ");
        dia = leer.nextInt();
        checkout = new Date(anio, mes, dia);
        posicion = (int)(Math.random() * 50 + 1);
        int op;
        do {
            System.out.println("SELECCIONE TIPO DE EMBARCACION:");
            System.out.println("1- VELERO");
            System.out.println("2- BARCO");
            System.out.println("3- YATE");
            op = leer.nextInt();
            switch(op) {
                case 1: Barco velero = new Velero();
                velero.crear();
                barco = velero;
                break;
                case 2: Barco motor = new AMotor();
                motor.crear();
                barco = motor;
                break;
                case 3: Barco yate = new Yate();
                yate.crear();
                barco = yate;
                break;
                default: System.out.println("Opción incorrecta, intente nuevamente");
            }
        } while (op < 1 || op > 3);
    }
    
    public void alquiler() {
        long milisegundos = checkout.getTime() - checkin.getTime();
        double estadia = milisegundos / 86400000;       // un día = 86400000 milisegundos
        System.out.println("Total de dias: " + estadia);
        System.out.println("El costo de alquiler $: " + barco.modulo() * estadia);
    }

}
