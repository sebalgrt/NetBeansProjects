/*
 Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Mes {
    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
         "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String oculto = mes[4];

    public String getOculto() {
        return oculto;
    }
}

