/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_3;

import Servicio.ArregloServicio;

/**
 *
 * @author Seba
 */
public class Java_P7_POOUtilidades_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double arregloA[] = new double [50];
        double arregloB[] = new double [20];
        ArregloServicio vecA = new ArregloServicio();
        ArregloServicio vecB = new ArregloServicio();
        vecA.inicializarA(arregloA);
        vecA.mostrar(arregloA);
        vecA.ordenar(arregloA);
        vecB.inicializarB(arregloA, arregloB);
        vecA.mostrar(arregloA);
        vecB.mostrar(arregloB);
    }
}
