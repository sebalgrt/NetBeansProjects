/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author recepcal
 */
public class Cafetera {
    private int capMax = 1000;
    private double cantAct;

    public Cafetera() {
    }

    public Cafetera(double cantAct) {
        this.cantAct = cantAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public double getCantAct() {
        return cantAct;
    }

    public void setCantAct(double cantAct) {
        this.cantAct = cantAct;
    }
}
