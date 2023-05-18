/*
 un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Ahorcado {
    private String[] palabra;
    private int encontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int intentos) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
}
