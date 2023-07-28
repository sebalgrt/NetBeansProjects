/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDao;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Seba
 */
public class ProductoService {
    public void menu() {
        Scanner leer = new Scanner(System.in);
        try {
            char op;
            do {
                System.out.println("TIENDA MENÚ");
                System.out.println("A- Nombre de todos los productos");
                System.out.println("B- Nombre y precio de todos los productos");
                System.out.println("C- Productos entre $120 y $202.");
                System.out.println("D- Productos portátiles");
                System.out.println("E- Nombre y precio producto mas barato");
                System.out.println("F- Ingresar producto");
                System.out.println("G- Ingresar fabricante");
                System.out.println("H- Editar producto");
                System.out.println("I- SALIR");
                System.out.print("Ingrese una opcion: ");
                op = leer.next().toUpperCase().charAt(0);
                System.out.println("");
                switch (op) {
                    case 'A': 
                        ProductoDAO a = new ProductoDAO();
                        Collection<Producto> listaA = a.listaProd();
                        for (Producto aux : listaA) {
                            System.out.println(aux.getNombre());
                        }
                        System.out.println("");
                    break;
                    case 'B':
                        ProductoDAO b = new ProductoDAO();
                        Collection<Producto> listaB = b.prodPrecios();
                        for (Producto aux : listaB) {
                            System.out.println(aux.getNombre() + " - $" + aux.getPrecio());
                        }
                        System.out.println("");
                    break;
                    case 'C':
                        ProductoDAO c = new ProductoDAO();
                        Collection<Producto> listaC = c.entre120y202();
                        for (Producto aux : listaC) {
                            System.out.println(aux.getNombre() + " - $" + aux.getPrecio());
                        }
                        System.out.println("");
                    break;
                    case 'D':
                        ProductoDAO d = new ProductoDAO();
                        Collection<Producto> listaD = d.portatil();
                        for (Producto aux : listaD) {
                            System.out.println(aux.getNombre() + " - $" + aux.getPrecio());
                        }
                        System.out.println("");
                    break;
                    case 'E':
                        ProductoDAO e = new ProductoDAO();
                        Collection<Producto> listaE = e.barato();
                        for (Producto aux : listaE) {
                            System.out.println(aux.getNombre() + " - $" + aux.getPrecio());
                        }
                        System.out.println("");
                    break;
                    case 'F':
                        System.out.print("Ingrese código de producto: ");
                        int cod = leer.nextInt();
                        System.out.print("Ingrese nombre: ");
                        String nom = leer.next();
                        System.out.print("Ingrese precio: ");
                        double prec = leer.nextDouble();
                        System.out.print("Ingrese codigo de fabricante: ");
                        int codf = leer.nextInt();
                        Producto f = new Producto(cod, nom, prec, codf);
                        ProductoDAO fdao = new ProductoDAO();
                        fdao.ingresarProducto(f);
                    break;
                    case 'G':
                        System.out.print("Ingrese código de fabricante: ");
                        int codfab = leer.nextInt();
                        System.out.print("Ingrese nombre: ");
                        String nomfab = leer.next();
                        Fabricante g = new Fabricante(codfab, nomfab);
                        FabricanteDao gdao = new FabricanteDao();
                        gdao.ingresarFab(g);
                    break;
                    case 'H':
                        System.out.print("Ingrese código de producto a editar: ");
                        int codedit = leer.nextInt();
                        System.out.print("Ingrese nuevo nombre: ");
                        String nomedit = leer.next();
                        System.out.print("Ingrese nuevo precio: ");
                        double precedit = leer.nextDouble();
                        System.out.print("Ingrese nuevo codigo de fabricante: ");
                        int codfedit = leer.nextInt();
                        Producto fedit = new Producto(codedit, nomedit, precedit, codfedit);
                        ProductoDAO fdaoedit = new ProductoDAO();
                        fdaoedit.editarProd(fedit);
                    break;
                    case 'I': System.out.println("ADIOS!!!");
                    break;
                    default: System.out.println("Opción incorrecta");
                }
            } while (op != 'I');
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
