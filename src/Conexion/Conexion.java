/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxi
 */
public class Conexion {
    
    private static Conexion instance=null;
    private Connection conexion;
    
    private Conexion(){
      
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/kinesiologia";
           
            conexion = DriverManager.getConnection(url, "postgres", "admin");
            System.out.println("conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    /*
public synchronized static Conexion saberEstado(){
        if(instance==null){
            instance=new Conexion();
        }
        return instance;
    }
    */
    public Connection getConexion() {
        return conexion;
    }
    
    public void cerrarConexion(){
       instance=null;
        try {
            conexion.close();
            System.out.println("desconectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}