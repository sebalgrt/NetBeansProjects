/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Seba
 */
public final class FabricanteDao extends DAO {
    
    public void ingresarFab(Fabricante fab) throws Exception {
        try {
            if (fab == null) {
                throw new Exception ("No se ingresaron datos");
            }
            String sql = "INSERT INTO fabricante VALUES (" + fab.getCodigo() + ", '" + 
                    fab.getNombre() + "');";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
