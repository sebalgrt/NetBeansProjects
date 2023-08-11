/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g16_jpa_ejercicio_libreria.Servicios;

import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java_g16_jpa_ejercicio_libreria.Entidades.Cliente;

/**
 *
 * @author Seba
 */
public class ClienteService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ClienteDAO cdao = new ClienteDAO();
    List<Cliente> clientes = new ArrayList();

    public void crear() {
        try {
            System.out.print("Ingrese nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese apellido: ");
            String apellido = leer.next();
            System.out.print("Ingrese DNI: ");
            Long dni = leer.nextLong();
            System.out.print("Ingrese teléfono: ");
            String tel = leer.next();
            Cliente cliente = new Cliente(dni, nombre, apellido, tel);
            cdao.crear(cliente);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void borrar() {
        try {
            System.out.print("Ingrese ID del cliente a borrar: ");
            Integer id = leer.nextInt();
            Cliente cliente = cdao.buscarClienteId(id);
            cdao.borrar(cliente);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void modificar() {
        try {
            System.out.print("Ingrese ID del cliente a modificar: ");
            Integer id = leer.nextInt();
            Cliente cliente = cdao.buscarClienteId(id);
            System.out.print("Ingrese nuevo nombre: ");
            cliente.setNombre(leer.next());
            System.out.print("Ingrese nuevo apellido: ");
            cliente.setApellido(leer.next());
            System.out.print("Ingrese nuevo DNI: ");
            cliente.setDni(leer.nextLong());
            System.out.print("Ingrese nuevo teléfono: ");
            cliente.setTel(leer.next());
            cdao.modificar(cliente);
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            leer.nextLine();
        }
    }

    public void buscar() {
        try {
            System.out.println("1- Buscar por ID");
            System.out.println("2- Buscar por Apellido");
            System.out.println("3- Mostrar todos");
            System.out.print("Ingrese opción: ");
            int op = leer.nextInt();
            switch (op) {
                case 1: 
                    System.out.print("Ingrese ID: ");
                    Cliente cliente = cdao.buscarClienteId(leer.nextInt());
                    System.out.println(cliente.getId() + "- " + cliente.getNombre() +
                            " " + cliente.getApellido() + " - Tel: " + cliente.getTel());
                    break;
                case 2:
                    System.out.print("Ingrese apellido (o parte): ");
                    clientes = cdao.buscarClienteNombre(leer.next());
                    for (Cliente aux : clientes) {
                        System.out.println(aux.getId() + "- " + aux.getNombre() +
                            " " + aux.getApellido() + " - Tel: " + aux.getTel());
                    }
                    break;
                case 3:
                    clientes = cdao.mostrarClientes();
                    for (Cliente aux : clientes) {
                        System.out.println(aux.getId() + "- " + aux.getNombre() +
                            " " + aux.getApellido() + " - Tel: " + aux.getTel());
                    }
                    break;
                case 4:
             }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR! Dato incorrecto");
            System.out.println(e);
            leer.nextLine();
        }
    }
    
    
}
