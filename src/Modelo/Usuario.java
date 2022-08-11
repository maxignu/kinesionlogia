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
    
  private String User;     
  private String Pass;  
  private Date fechaAlta;
  private Boolean estado;

    public Usuario(String User, String Pass, Date fechaAlta, Boolean estado) {
        this.User = User;
        this.Pass = Pass;
        this.fechaAlta = fechaAlta;
        this.estado = estado;
        
        
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

 
}
