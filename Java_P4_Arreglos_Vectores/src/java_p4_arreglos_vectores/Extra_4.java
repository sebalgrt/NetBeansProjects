/*
 Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 - Primer trabajo práctico evaluativo 10%
 - Segundo trabajo práctico evaluativo 15%
 - Primer Integrador 25%
 - Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package java_p4_arreglos_vectores;

/**
 *
 * @author Seba
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double matriz [][] = new double [10][5];
        int ok = 0, not = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 5) {
                    matriz[i][5] = (matriz[i][0] * 0.10) + (matriz[i][1] * 0.15) + (matriz[i][2] * 0.25) + (matriz[i][3] * 0.50);
                    if (matriz[i][5] >= 7) {
                        ok ++;
                    }else {
                        not++;
                    }
                }else {
                    matriz[i][j] = (int) (Math.random()*10);
                }
            }
        }
        System.out.println("La cantidad de alumnos APROBADOS es: " + ok);
        System.out.println("La cantidad de alumnos DESAPROBADOS es: " + not);
        System.out.println("");
        for (double []fila: matriz) {
            for (double elem: fila) {
                System.out.print(elem+ "  ");
            }
        System.out.println("");
        }
    }
    
}
