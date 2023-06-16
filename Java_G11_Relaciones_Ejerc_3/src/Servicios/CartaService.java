/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class CartaService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public ArrayList<Carta> crear() {
        for (int i = 0; i < 12; i++) {
            if (i == 7 || i == 8) {
            }else {
                Carta nueva = new Carta();
                nueva.setNum(i + 1);
                nueva.setPalo("ESPADA");
                mazo.add(nueva);
            }
        }
        for (int i = 0; i < 12; i++) {
            if (i == 7 || i == 8) {
            }else {
                Carta nueva = new Carta();
                nueva.setNum(i + 1);
                nueva.setPalo("ORO");
                mazo.add(nueva);
            }
        }
        for (int i = 0; i < 12; i++) {
            if (i == 7 || i == 8) {
            }else {
                Carta nueva = new Carta();
                nueva.setNum(i + 1);
                nueva.setPalo("BASTO");
                mazo.add(nueva);
            }
        }
        for (int i = 0; i < 12; i++) {
            if (i == 7 || i == 8) {
            }else {
                Carta nueva = new Carta();
                nueva.setNum(i + 1);
                nueva.setPalo("COPA");
                mazo.add(nueva);
            }
        }
        return mazo;
    }

    public void mostrarBaraja(ArrayList<Carta> mazo) {
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
        System.out.println("");
    }

    public ArrayList<Carta> barajar(ArrayList<Carta> mazo) {
        Collections.shuffle(mazo);
        return mazo;
    }

    public void siguienteCarta(ArrayList<Carta> mezcladas) {
        if (mezcladas.size() != 0) {
            System.out.println(mezcladas.get(0).toString());
            monton.add(mezcladas.get(0));
            mezcladas.remove(0);
        }else {
            System.out.println("No quedan cartas en el mazo");
        }
        System.out.println("");
    }

    public void cartasDisponibles(ArrayList<Carta> mezcladas) {
        System.out.println("Quedan " + mezcladas.size() + " cartas en el mazo");
        System.out.println("");
    }

    public void darCartas(ArrayList<Carta> mezcladas) {
        System.out.print("Cuantas cartas quiere dar?: ");
        int cant = leer.nextInt();
        if (mezcladas.size() > cant) {
            for (int i = 0; i < cant; i++) {
                System.out.println(mezcladas.get(0).toString());
                monton.add(mezcladas.get(0));
                mezcladas.remove(0);
            }
        }else {
            System.out.println("No quedan tantas cartas en el mazo");
        }
        System.out.println("");
    }

    public void cartasMonton() {
        if (monton.size() != 0) {
            for (Carta carta : monton) {
            System.out.println(carta.toString());
            }
        }else {
            System.out.println("No hay cartas en el montón");
        }
        System.out.println("");
    }
    
}
