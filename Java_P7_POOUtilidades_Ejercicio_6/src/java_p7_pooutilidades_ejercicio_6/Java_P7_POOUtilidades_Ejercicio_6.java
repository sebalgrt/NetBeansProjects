/*
 Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos
 */
package java_p7_pooutilidades_ejercicio_6;

import Entidades.Curso;
import Servicios.CursoService;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Java_P7_POOUtilidades_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CursoService nuevo = new CursoService();
        System.out.print("Ingrese cantidad de cursos: ");
        int cant = leer.nextInt();
        Curso [] cursos = new Curso [cant];
        for (int i = 0; i < cursos.length; i++) {
            cursos[i] = nuevo.crearCurso();
        }
        nuevo.calcularGananciaSemanal(cursos[0]);
        System.out.println("");
        nuevo.calcularGananciaSemanal(cursos[1]);
        System.out.println("");
        nuevo.calcularGananciaSemanal(cursos[2]);
    }
}
