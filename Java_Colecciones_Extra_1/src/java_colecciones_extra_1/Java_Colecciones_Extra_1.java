/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_colecciones_extra_1;

import Servicios.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Java_Colecciones_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService nuevo = new AlumnoService();
        ArrayList alta = nuevo.crear();
        nuevo.mostrar(alta);
        nuevo.baja(alta);
        nuevo.mostrar(alta);
        nuevo.editar(alta);
        nuevo.mostrar(alta);
    }
    
}
