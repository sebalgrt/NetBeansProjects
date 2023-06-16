/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
juego se trata de un número de jugadores, que, con un revolver de agua, el cual
posee una sola carga de agua, se dispara y se moja. Las clases por hacer del
juego son las siguientes
 */
package java_g11_relaciones_ejerc_2;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author Seba
 */
public class Java_G11_Relaciones_Ejerc_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.print("Ingrese cantidad de jugadores (2 a 6): ");
        int cant = leer.nextInt();
        if (cant < 2 || cant > 6) {
            cant = 6;
            System.out.println("Jugarán 6 jugadores");
        }else {
            System.out.println("Jugarán " + cant + " jugadores");
        }
        for (int i = 0; i < cant; i++) {
            Jugador nuevo = new Jugador();
            nuevo.setId(i + 1);
            jugadores.add(nuevo);
        }
        
        
        
    }
    
}
