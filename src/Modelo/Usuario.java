/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author maxi
 */
public class Usuario {
  
  private Long id_usuario;  
  private String user;     
  private String pass;  
  private Date fechaAlta;
  private String estado;
  private Persona persona=new Persona();

    public Usuario(Long id_usuario,  String user, String pass, Date fechaAlta, String estado, Persona persona) {
        this.id_usuario = id_usuario;
        this.user = user;
        this.pass = pass;
        this.fechaAlta = fechaAlta;
        this.estado = estado;
        this.persona=persona;
        
        
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String User) {
        this.user = User;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String Pass) {
        this.pass = Pass;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

 
}
