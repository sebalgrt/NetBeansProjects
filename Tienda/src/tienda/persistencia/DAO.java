/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Seba
 */
public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    private final String USER = "root";
    private final String PASS = "root";
    private final String DB = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarDB() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://localhost:3306/" + DB + "?useSSL=False";
            conexion = DriverManager.getConnection(url, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    protected void desconectarDB () throws Exception{
        try {
            if (conexion != null) {
                conexion.close();
            }
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insModDel (String instruccion) throws Exception {
        try {
            conectarDB();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(instruccion);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
    protected void consultarDB (String instruccion) throws Exception {
        try {
            conectarDB();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(instruccion);

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
}
