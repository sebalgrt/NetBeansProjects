/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Sala {
    private int f;
    private int c;
    private boolean ocup = false;
    private String lc;
    private String locup;
    private ArrayList<Persona> publico;

    public Sala() {
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isOcup() {
        return ocup;
    }

    public void setOcup(boolean ocup) {
        this.ocup = ocup;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getLocup() {
        return locup;
    }

    public void setLocup(String locup) {
        this.locup = locup;
    }

    public ArrayList<Persona> getPublico() {
        return publico;
    }

    public void setPublico(ArrayList<Persona> publico) {
        this.publico = publico;
    }
    

    @Override
    public String toString() {
        return " |" + f + "-" + lc + ": " + locup + '|';
    }
    
//    METODOS
    ArrayList<Sala> sala = new ArrayList();
    public ArrayList<Sala> crear() {
        for (int i = 8; i > 0; i--) {
            for (int j = 1; j < 7; j++) {
                Sala butaca = new Sala();
                butaca.setF(i);
                butaca.setC(j);
                butaca.setLc(letaCol(j));
                butaca.setLocup(letraOcup(ocup));
                sala.add(butaca);
            }
        }
        return sala;
    }

    private String letaCol(int j) {
        String out = "";
        switch(j) {
            case 1: out = "A";
            break;
            case 2: out = "B";
            break;
            case 3: out = "C";
            break;
            case 4: out = "D";
            break;
            case 5: out = "E";
            break;
            case 6: out = "F";
            break;
        }
        return out;
    }

    private String letraOcup(boolean ocup) {
        String out = " ";
        if (ocup) {
            out = "X";
        }
        return out;
    }

    public void mostrar(ArrayList<Sala> sala) {
        int cont = 0;
        for (int i = 8; i > 0; i--) {
            for (int j = 1; j < 7; j++) {
                if (sala.get(cont).f == i && sala.get(cont).c == j) {
                    System.out.print(sala.get(cont).toString());
                    cont++;
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void ocupcionSala(ArrayList<Sala> sala) {
        System.out.println("Capasidad máxima: " + sala.size() + " personas");
        int cont = 0;
        for (int i = 0; i < sala.size(); i++) {
            if (!sala.get(i).isOcup()) {
                cont++;
            }
        }
        System.out.println("La sala tiene " + cont + " asientos disponibles");
        System.out.println("");
    }
}
