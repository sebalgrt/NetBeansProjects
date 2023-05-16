/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class FechaService {
//Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//new Date(anio, mes, dia);
    public Date FechaNacimiento(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese día de nacimiento (dd): ");
        int dia = leer.nextInt() + 1;
        System.out.print("Ingrese mes de nacimiento (mm): ");
        int mes = leer.nextInt();
        System.out.print("Ingrese año de nacimiento (yyyy): ");
        int anio = leer.nextInt() - 1900;
        Date nacimiento = new Date(anio, mes, dia);
        return nacimiento;
    }
    
//Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
    public Date FechaActual() {
        return new Date();
    }
    
//Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).
    public int Diferencia(Date FechaNacimiento, Date FechaActual){
        int edad = FechaActual.getYear() - FechaNacimiento.getYear();
        return edad;
    }
}
