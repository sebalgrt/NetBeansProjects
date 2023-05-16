/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author Seba
 */
public class ArregloServicio {

//Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
    public void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double) Math.random() * 10;
        }
    }

//Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

//Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        double []aux = new double [arreglo.length];
        int j = 0;
        for (int i = arreglo.length - 1; i > -1 ; i--) {
            aux[j] = arreglo[i];
            j++;
        }
        System.arraycopy(aux, 0, arreglo, 0, arreglo.length);
        //System.out.println(Arrays.toString(arreglo));
    }

//Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
    }
}
