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
            String sql = "INSERT INTO producto VALUES (" + prod.getCodigo() + ", '" + 
                    prod.getNombre() + "', " + prod.getPrecio() + ", " + 
                    prod.getCodigoFabricante() + ";";
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
            String sql = "UPDATE producto SET nombre = '" + prod.getNombre() + "', " + 
                    prod.getPrecio() + ", " + prod.getCodigoFabricante() + " WHERE codigo = " + 
                    prod.getCodigo() + ";";
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
}
