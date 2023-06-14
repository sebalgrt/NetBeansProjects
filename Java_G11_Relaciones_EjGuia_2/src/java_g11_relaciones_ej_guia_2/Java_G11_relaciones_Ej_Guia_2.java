/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g11_relaciones_ej_guia_2;

import Entidades.Equipo;
import Servicios.EquipoService;

/**
 *
 * @author Seba
 */
public class Java_G11_relaciones_Ej_Guia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquipoService nuevo = new EquipoService();
        Equipo uno = nuevo.crear();
        nuevo.mostrar(uno);
    }
    
}
