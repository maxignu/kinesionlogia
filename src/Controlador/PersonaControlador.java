/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author maxi
 */
public class PersonaControlador {
    
     private static Conexion conexion;
    
     public long agregar(Persona dp ) {
         
         DomicilioControlador domicilioControlador= new DomicilioControlador();
         Long llave= null;
         ResultSet rs;
         try {
             String query= "insert into persona(nombre,apellido,dni,fechaNac,telefono,email )VALUES (?,?,?,?,?,?)";
         PreparedStatement stmt;
         
         stmt = conexion.getConexion().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
         stmt.setString(1, dp.getNombre());
         stmt.setString(2, dp.getApellido());
         stmt.setLong(3, dp.getDni());
         stmt.setDate(4, util.Util.dateToSqlDate(dp.getFechaNac()));
         stmt.setInt(5, dp.getTelefono());
         stmt.setString(6, dp.getEmail());
         
         if(stmt.executeUpdate()>0){
             rs= stmt.getGeneratedKeys();
             if(rs != null && rs.next()){
                 llave= rs.getLong(3);
              }
            
             }
         
         } catch (SQLException ex) {
             Logger.getLogger(PersonaControlador.class.getName()).log(Level.SEVERE, null, ex);
         }
         return llave;
         
  }

  public boolean modificar(Persona dp) {
      
      try {
          String query="";
          
          PreparedStatement stmt;
          stmt= conexion.getConexion().prepareStatement(query);
          
          stmt.setString(1, dp.getNombre());
          stmt.setString(2, dp.getApellido());
          stmt.setLong(3, dp.getDni());
          stmt.setDate(4, util.Util.dateToSqlDate(dp.getFechaNac()));
          stmt.setInt(5, dp.getTelefono());
          stmt.setString(6, dp.getEmail());
          
          if(stmt.executeUpdate() >0){
              return true;
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(PersonaControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
      return false;
  }

  public boolean eliminar(Persona dp) {
     
      try {
          
          String query="";
          
          PreparedStatement stmt;
          stmt=conexion.getConexion().prepareStatement(query);
          
          stmt.setLong(0, 0);
          
          if(stmt.executeUpdate()>0){
              return true;
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(PersonaControlador.class.getName()).log(Level.SEVERE, null, ex);
      }
      return false;
  }

  public Persona extraer(Long id) {
      
      DomicilioControlador domicilioControlador=new DomicilioControlador();
      PreparedStatement stmt;
      Persona dp;
      try {
           String query = "SELECT id_persona,nombre,apellido,dni,fechaNac,telefono,email,idDomicilio FROM  personas WHERE id_persona";
          
          stmt = conexion.getConexion().prepareStatement(query);
          
          stmt.setLong(1, id);
          
          ResultSet rs = stmt.executeQuery();
          
          while (rs.next()) {
              dp = new Persona();
              dp.setId_persona(rs.getLong("id_persona"));
              dp.setNombre(rs.getString("nombre"));
              dp.setApellido(rs.getString("apellido"));
              dp.setDni(rs.getInt("dni"));
              dp.setFechaNac(rs.getDate("fechaNac"));
              dp.setTelefono(rs.getInt("telefono"));
              dp.setEmail(rs.getString("email"));
              dp.setDomicilio(DomicilioControlador.extraer(rs.getLong("idDomicilio")));
          
          }
      } catch (Exception e) {
          
         
      }
      
      
      
  }
}
