/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
los atributos heredados.  
Los constructores que se implementarán serán: 
• Un constructor vacío. 
• Un constructor con la resolución, sintonizador TDT y el resto de los
atributos heredados. Recuerda que debes llamar al constructor de la clase
padre. 
Los métodos que se implementara serán: 
• Método get y set de los atributos resolución y sintonizador TDT. 
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor. 
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public final class Televisor extends Electrodomestico {
    private Integer resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean tdt, Double precio, String color, char eficiencia, Double peso) {
        super(precio, color, eficiencia, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    Scanner leer = new Scanner(System.in);

    public void crearTele() {
        super.crear();
        System.out.print("Cantidad de pulgadas: ");
        resolucion = leer.nextInt();
        System.out.print("Tiene TDT? (S/N): ");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            tdt = true;
        }else {
            tdt = false;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio += precio * 0.3;
        }
        if (tdt) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        System.out.print("Televisor:");
        return super.toString();
    }
    
}
