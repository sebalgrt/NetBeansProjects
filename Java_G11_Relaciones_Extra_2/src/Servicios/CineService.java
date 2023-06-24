/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cine;
import Entidades.Persona;
import Entidades.Sala;
import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class CineService {
    
    public void start() {
        Cine pelicula = new Cine();
        Cine film = pelicula.pelicula();    //CREO LA PELICULA
        Sala func = new Sala();
        Persona publico = new Persona();
        ArrayList<Sala> sala = func.crear();        //CREO LA SALA
//        func.mostrar(sala);
//        func.ocupcionSala(sala);
        ArrayList<Persona> espectadores = publico.publico(); //CREO EL PUBLICO
//        publico.mostrarPublico(espectadores);
//        ArrayList<Sala> espec = completarSala(sala, espectadores, film);
        func.setPublico(completarSala(sala, espectadores, film));
        ArrayList espect = func.getPublico();
        func.mostrar(espect);

    }

    private ArrayList completarSala(ArrayList<Sala> sala, ArrayList<Persona> publico, Cine film) {
        for (int i = 0; i < publico.size(); i++) {
            if (publico.get(i).getEdad() < film.getApt() && publico.get(i).getDinero() < film.getEntrada()) {
                publico.remove(i);
            }
        }
        for (int i = 0; i < publico.size(); i++) {
            do {
                int f = (int)(Math.random() * 8 + 1);
                int c = (int)(Math.random() * 6 + 1);
                if (sala.get(i).getF() == f && sala.get(i).getC() == c && sala.get(i).isOcup() == false) {
                sala.get(i).setOcup(true);
                
            }
            } while (sala.get(i).isOcup() == false);
        }
        return publico;
    }

   
}
