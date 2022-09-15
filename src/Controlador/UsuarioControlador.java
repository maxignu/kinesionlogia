/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxi
 */
public class UsuarioControlador {
    
    private static Conexion conexion;
    
    public boolean agregar(Usuario usuario) {
   //  conexion=Conexion.saberEstado();
     PersonaControlador personaControlador= new PersonaControlador();
        try {
            conexion.getConexion().setAutoCommit(false);
            String query= "INSERT INTO usuarios (id, user, pass, fechaAlta, estado) VALUES (?,?,?,?,?)";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPass());
            stmt.setString(3, usuario.getEstado().toString());
         //   stmt.setString(4, usuario.getFechaAlta());
            stmt.setLong(4, personaControlador.agregar(usuario.getPersona()));
            
            if(stmt.executeUpdate() >0){
            conexion.getConexion().commit();
            return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE,null, ex);
            try {
                conexion.getConexion().rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE,null, ex1);
            }
        }
        return false;
    }
    public boolean modificar(Usuario usuario){
     PersonaControlador personaControlador= new PersonaControlador();
        try {
            conexion.getConexion().setAutoCommit(false);
            String query= "UPDATE usuarios SET user= ?, pass= ?,fechaAlta= ?,estado= ? WHERE  id_usuario=?";
           
            PreparedStatement stmt;
            if(personaControlador.modificar(usuario.getPersona())){
                stmt = conexion.getConexion().prepareStatement(query);
                stmt.setString(1, usuario.getUser());
                stmt.setString(2, usuario.getPass());
                stmt.setString(3, usuario.getEstado().toString());
                
                if (stmt.executeUpdate() > 0){
                conexion.getConexion().commit();
                return true;
                
                }        
            } 
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conexion.getConexion().rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return false;
    }
    public boolean eliminar(Usuario usuario){
    
        PersonaControlador personaControlador= new PersonaControlador();
        try {
            conexion.getConexion().setAutoCommit(false);
            String query= "DELETE FROM usuarios WHERE id_usuarios = ?";
            
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
    }
        return false;
    }     
    
    public Usuario extraer(Long id){
    
        Usuario usuario = new Usuario();
        PreparedStatement stmt;
        PersonaControlador pec = new PersonaControlador();
        
        try {
            String query="SELECT id_usuario,user, pass,fechaAlta,estado,persona FROM usuarios WHERE id_usuarios";
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1,id);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                usuario.setId_usuario(rs.getLong("id_usuario"));
                usuario.setUser(rs.getString("user"));
                usuario.setPass(rs.getString("pass"));
                usuario.setFechaAlta(rs.getDate("fechaAlta"));
                usuario.setEstado("estado");
                usuario.setPersona(pec.extraer(rs.getLong("id_persona")));
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    public ArrayList<Usuario> extraerTodo(){
        
        ResultSet rs;
        Usuario aux = new Usuario();
        ArrayList <Usuario> arrayUsuarios = new ArrayList<Usuario>();
        
        try {
            String query = "SELECT FROM usuarios";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                aux = extraer(rs.getLong(1));
                arrayUsuarios.add(aux);
            }
        } catch (SQLException ex) {
             Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUsuarios;
        }
    public ArrayList<Usuario> extraerTodo(String user){
               
        Usuario aux = new Usuario();
        ArrayList <Usuario> arrayUsuarios = new ArrayList<Usuario>();
        ResultSet rs;
        try {
            String query = "SELECT FROM usuarios WHERE user ilike '"+ user +"%'";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                aux = extraer(rs.getLong(1));
                arrayUsuarios.add(aux);
            }
        } catch (SQLException ex) {
             Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayUsuarios;
        }
     public Usuario validar (Usuario usuarioAux){
        Usuario usuario= null;
        PreparedStatement stmt;
        PersonaControlador pec =new PersonaControlador();
        
         try {
             String query="SELECT id_usuario, userm pass,FROM usuarios WHERE user=? AND pass";
             
             stmt = conexion.getConexion().prepareStatement(query);
             stmt.setString(1, usuarioAux.getUser());
             stmt.setString(2, usuarioAux.getUser());
             
             ResultSet rs = stmt.executeQuery();
             
             while (rs.next()) {
             usuario=new Usuario();
             usuario.setId_usuario(rs.getLong("id_usuario"));
             usuario.setUser(rs.getString("user"));
             usuario.setPass(rs.getString("pass"));
             usuario.setFechaAlta(rs.getDate("fechaAlta"));
             usuario.setEstado(rs.getString("estado"));
             usuario.setPersona(pec.extraer(rs.getLong("id_persona")));
             }
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
         }
        return usuario;
    }
     
    }
    
   