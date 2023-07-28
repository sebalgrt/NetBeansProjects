/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author Seba
 */
public final class ProductoDAO extends DAO {
    
    public void ingresarProd(Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception ("Debe indicar un nombre");
            }
            String sql = "insert into producto values (" + prod.getCodigo() 
                    + ", '" + prod.getNombre() + "'," + prod.getPrecio() 
                    + ", " + prod.getCodigoFabricante() + ")";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarProd(Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception ("Debe indicar producto a editar");
            }
            String sql = "UPDATE producto SET nombre = '" + prod.getNombre() 
                    + "', precio = " + prod.getPrecio() 
                    + ", codigo_fabricante = " + prod.getCodigoFabricante()
                    + " WHERE codigo = " + prod.getCodigo() + ";";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listaProd() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto;";
            consultarDB(sql);
            Collection<Producto> lista = new ArrayList();
            while (resultado.next()) {   
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                lista.add(prod);
            }
            desconectarDB();
            return lista;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> prodPrecios() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto;";
            consultarDB(sql);
            Collection<Producto> lista = new ArrayList();
            while (resultado.next()) {   
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                lista.add(prod);
            }
            desconectarDB();
            return lista;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> entre120y202() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio "
                    + "BETWEEN 120 AND 202;";
            consultarDB(sql);
            Collection<Producto> lista = new ArrayList();
            while (resultado.next()) {   
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                lista.add(prod);
            }
            desconectarDB();
            return lista;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> portatil() throws Exception {
        try {
            String sql = "select nombre, precio from producto where nombre "
                    + "like '%portatil%';";
            consultarDB(sql);
            Collection<Producto> lista = new ArrayList();
            while (resultado.next()) {   
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                lista.add(prod);
            }
            desconectarDB();
            return lista;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> barato() throws Exception {
        try {
            String sql = "select nombre, precio from producto order by precio "
                    + "limit 1;";
            consultarDB(sql);
            Collection<Producto> lista = new ArrayList();
            while (resultado.next()) {   
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                lista.add(prod);
            }
            desconectarDB();
            return lista;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public void ingresarProducto(Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception ("No se ingresaron datos");
            }
            String sql = "insert into producto values (" + prod.getCodigo() 
                    + ", '" + prod.getNombre() + "', " + prod.getPrecio() 
                    + ", " + prod.getCodigoFabricante() + ");";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
}
