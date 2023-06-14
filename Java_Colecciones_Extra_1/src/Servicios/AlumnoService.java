/*
 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los 
objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , 
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
apellido de forma ascendente. 
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
nombre de forma descendente. 
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo 
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas, 
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
VENEZOLANA
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> curso = new ArrayList();
    String[] nombres = {"Seba", "Lichi", "Franco", "Gloria", "Jorge", "Valeria", "Luciano", "Laura", "Ana", "Roxana"};
    String[] apellidos = {"Martinez", "Echaniz", "Fernandez", "Gonzalez", "Perez", "Veron", "Conforti", "Desua", "Baldino", "Tontikian"};

    public ArrayList crear() {
        for (int i = 0; i < 20; i++) {
            int nom = (int)(Math.random() * 10);
            int ape = (int)(Math.random() * 10);
            int leg = (int)(Math.random() * 1000);
            String nombre = nombres[nom];
            String apellido = apellidos[ape];
            Date fecha = crearNacimiento();
            String nacion = crearNacionalidad();
            Alumno nuevo = new Alumno(nombre, apellido, fecha, nacion, leg);
            curso.add(nuevo);
        }
        System.out.println("");
        return curso;
    }

    private Date crearNacimiento() {
        int anio = ((int)(Math.random() * 60 + 2005) - 1900);
        int mes = (int)(Math.random() * 12 + 1);
        int dia = (int)(Math.random() * 30 + 1);
        Date fecha = new Date(anio, mes, dia);
        return fecha;
    }

    private String crearNacionalidad() {
        int nac = (int)(Math.random() * 3 + 1);
        String nacionalidad = "";
        switch(nac) {
            case 1: nacionalidad = "Argentino";
            break;
            case 2: nacionalidad = "Chileno";
            break;
            case 3: nacionalidad = "Venezolano";
            break;
        }
        return nacionalidad;
    }

    public void mostrar(ArrayList start) {
        for (Object aux : start) {
            System.out.println(aux.toString());
        }
        System.out.println("");
    }

    public ArrayList baja(ArrayList alta) {
        System.out.print("Ingrese legajo a dar de baja: ");
        int leg = leer.nextInt();
        boolean conf = true;
        Iterator<Alumno> it = alta.iterator();
        while (it.hasNext()) {
            if (it.next().getLegajo() == leg) {
                it.remove();
                System.out.println("El legajo " + leg + " se elimonó correctamente");
                conf = false;
            }
        }
        if (conf) {
            System.out.println("El legajo " + leg + " no está en la lista");
        }
        System.out.println("");
        return alta;
    }

    public ArrayList editar(ArrayList alta) {
        System.out.print("Ingrese legajo a editar: ");
        int leg = leer.nextInt();
        Iterator<Alumno> it = alta.iterator();
        while (it.hasNext()) {
            if (it.next().getLegajo() == leg) {
                Alumno next = (Alumno) it;
                System.out.println(next.toString());
            }
            
            
        }
        System.out.println("");
        return alta;
    }
}
