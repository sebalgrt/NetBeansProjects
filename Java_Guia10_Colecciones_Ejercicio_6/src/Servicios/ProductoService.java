/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class ProductoService {
    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> tienda = new HashMap();

    public void agregar() {
        String conf;
        do {            
            System.out.print("Ingrese producto: ");
            String prod = leer.next();
            System.out.print("Ingrese precio: ");
            Double valor = leer.nextDouble();
            tienda.put(prod, valor);
            System.out.print("Desea ingresar otro producto? (S/N): ");
            conf = leer.next();
        } while (!conf.equalsIgnoreCase("n"));
        System.out.println("");
    }
    
    public void mostrar() {
        for (Map.Entry<String, Double> entry : tienda.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue()); 
        }
        System.out.println("");
    }

    public void editar() {
        System.out.print("Producto a remarcar: ");
        String prod = leer.next();
        boolean chk = true;
        for (Map.Entry<String, Double> aux : tienda.entrySet()) {
              if (aux.getKey().equals(prod)) {
                  System.out.println(aux.getKey() + " - $" + aux.getValue());
                  System.out.print("Ingrese nuevo valor: ");
                  Double val = leer.nextDouble();
                  aux.setValue(val);
                  System.out.println("Valor modificado correctamente");
                  chk = false;
                }
        }
        if (chk) {
            System.out.println(prod + " no está en la tienda");
        }
        System.out.println("");
    }

    public void eliminar() {
        System.out.print("Ingrese producto a eliminar: ");
        String del = leer.next();
        boolean chk = true;
        for (Map.Entry<String, Double> aux : tienda.entrySet()) {
            if (aux.getKey().equals(del)) {
                chk = false;
            }
        }
        if (chk) {
            System.out.println(del + "no está en la tienda");
        }else {
            tienda.remove(del);
            System.out.println("Producto eliminado correctamente");
        }
        System.out.println("");
    }
    
}
