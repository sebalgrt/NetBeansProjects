/*
 2. Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.  
Los constructores que se deben implementar son los siguientes: 
• Un constructor vacío. 
• Un constructor con todos los atributos pasados por parámetro. 
Los métodos a implementar son:  
• Métodos getters y setters de todos los atributos. 
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible. 
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto
y no será visible. 
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000. 
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el
valor del precio. Esta es la lista de precios: 
LETRA   PRECIO 
A       $1000 
B       $800 
C       $600 
D       $500 
E       $300 
F       $100 
PESO                PRECIO 
Entre 1 y 19 kg     $100 
Entre 20 y 49 kg    $500 
Entre 50 y 79 kg    $800 
Mayor que 80 kg     $1000 

3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList
de Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados. 
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos
mostrar, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
tenemos una lavadora con un precio de 2000 y un televisor de 5000, el
resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para
lavadora y 5000 para televisor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public abstract class Electrodomestico {
    protected Double precio;
    protected String color;
    protected char eficiencia;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char eficiencia, Double peso) {
        this.precio = precio;
        this.color = color;
        this.eficiencia = eficiencia;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(char eficiencia) {
        this.eficiencia = eficiencia;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void eficiencia(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            eficiencia = letra;
        }else {
            eficiencia = 'F';
        }
    }
    
    public void color(String col) {
        if (col.equals("BLANCO") || col.equals("NEGRO") || col.equals("ROJO") || col.equals("AZUL") || col.equals("GRIS")) {
            color = col;
        }else {
            color = "BLANCO";
        }
    }
    
    public void crear() {
        Scanner leer = new Scanner(System.in);
        precio = 1000.00;
        System.out.print("Ingrese color: ");
        color(leer.next().toUpperCase());
        System.out.print("Ingrese eficiencia energética: ");
        char ef = leer.next().toUpperCase().charAt(0);
        eficiencia(ef);
        System.out.print("Ingrese peso: ");
        peso = leer.nextDouble();
    }
    
    public void precioFinal() {
        if (eficiencia == 'A') {
            precio += 1000.00;
        }else if (eficiencia == 'B'){
            precio += 800.00;
        }else if(eficiencia == 'C') {
            precio += 600.00;
        }else if (eficiencia == 'D') {
            precio += 500.00;
        }else if (eficiencia == 'E') {
            precio += 300.00;
        }else if (eficiencia == 'D') {
            precio += 500.00;
        }else if (eficiencia == 'F') {
            precio += 100.00;
        }
        
        if (peso > 1 && peso < 19) {
            precio += 100.00;
        }else if (peso > 20 && peso < 49) {
            precio += 500.00;
        }else if (peso > 50 && peso < 79) {
            precio += 800.00;
        }else if (peso > 80) {
            precio += 1000.00;
        }
    }

    @Override
    public String toString() {
        return " $" + precio + " | " + color + " | " + eficiencia + " | " + peso + "kg";
    }
    
}
