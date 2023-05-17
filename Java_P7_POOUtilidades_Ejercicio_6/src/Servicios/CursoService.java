/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class CursoService {
//Método cargarAlumnos(): este método le permitirá al usuario ingresar
//los alumnos que asisten a las clases. Nosotros nos encargaremos de
//almacenar esta información en un arreglo e iterar con un bucle,
//solicitando en cada repetición que se ingrese el nombre de cada
//alumno.
    Scanner leer = new Scanner(System.in);
    
    public String [] cargarAlumnos() {
        String []alumno = new String [5];
        for (int i = 0; i < alumno.length; i++) {
            System.out.print("Ingrese nombre alumno " + (i + 1) + ": " );
            alumno[i] = leer.next().toUpperCase();
        }
    return alumno;
    }
    
//Método crearCurso(): el método crear curso, le pide los valores de
//los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Curso. En este método invocamos al
//método cargarAlumnos() para asignarle valor al atributo alumnos
    public Curso crearCurso() {
        Curso nuevo = new Curso();
        System.out.print("Ingrese nombre del curso: ");
        nuevo.setNombreCurso(leer.next().toUpperCase());
        System.out.print("Ingrese cantidad de horas por día: ");
        nuevo.setHorasXdia(leer.nextInt());
        System.out.print("Ingrese cantidad de días por semana: ");
        nuevo.setDiasXsemana(leer.nextInt());
        System.out.print("Ingrese turno: ");
        nuevo.setTurno(leer.next().toUpperCase());
        System.out.print("Ingrese valor de la hora ($/h): ");
        nuevo.setPrecioXhora(leer.nextDouble());
        nuevo.setAlumnos(cargarAlumnos());
        return nuevo;
    }
    
//Método calcularGananciaSemanal(): este método se encarga de
//calcular la ganancia en una semana por curso. Para ello, se deben
//multiplicar la cantidad de horas por día, el precio por hora, la
//cantidad de alumnos y la cantidad de días a la semana que se repite
//el encuentro.
    public void calcularGananciaSemanal(Curso curso) {
        double total = curso.getHorasXdia() * curso.getPrecioXhora() * curso.getAlumnos().length * curso.getDiasXsemana();
        System.out.println("Curso: " + curso.getNombreCurso());
        System.out.println("Horas:      " + curso.getHorasXdia());
        System.out.println("$/h:        " + curso.getPrecioXhora());
        System.out.println("Alumnos:    " + curso.getAlumnos().length);
        System.out.println("Días:       " + curso.getDiasXsemana());
        System.out.println("=================");
        System.out.println("TOTAL       " + total);
    }
}
