/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.PreparedStatement;

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
            String query= "INSERT INTO usuario (id, usuario, clave, fechaAlta, estado) VALUES (?,?,?,?,?)";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPass());
            stmt.setString(3, usuario.getEstado());
        } catch (Exception e) {
        }
    }
    
}
