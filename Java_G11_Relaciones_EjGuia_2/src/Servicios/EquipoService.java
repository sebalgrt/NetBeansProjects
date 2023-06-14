/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class EquipoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Equipo equipo = new Equipo();
    ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo crear() {
        System.out.print("Ingrese nombre del equipo: ");
        equipo.setNombre(leer.next());
        System.out.print("Ingrese nombre del DT: ");
        equipo.setDt(leer.next());
        for (int i = 0; i < 3; i++) {
            Jugador nuevo = new Jugador();
            System.out.print("Ingrese nombre: ");
            nuevo.setNombre(leer.next());
            System.out.print("Ingrese apellido: ");
            nuevo.setApellido(leer.next());
            System.out.print("Ingrese posición: ");
            nuevo.setPosicion(leer.next());
            System.out.print("Ingrese número: ");
            nuevo.setNumero(leer.nextInt());
            jugadores.add(nuevo);
        }
        equipo.setJugadores(jugadores);
        System.out.println("");
        return equipo;
    }

    public void mostrar(Equipo uno) {
        System.out.println(uno.toString());
    }
    
}
