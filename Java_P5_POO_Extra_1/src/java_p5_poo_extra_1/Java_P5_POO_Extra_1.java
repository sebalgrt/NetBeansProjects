/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package java_p5_poo_extra_1;

/**
 *
 * @author recepcal
 */
public class Java_P5_POO_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIACION CON CONSTRUCTOR VACIO
        Cancion tema1 = new Cancion();
        //INSTANCIACION CON PARAMENTROS
        Cancion tema2 = new Cancion("Doble vida", "Soda Stereo");
        
        //MUESTRA LOS DATOS DE LOS TEMAS INGRESADOS
        System.out.println(tema1.getTitulo() + " - " + tema1.getAutor());
        System.out.println(tema2.getTitulo() + " - " + tema2.getAutor());
    }
    
}
