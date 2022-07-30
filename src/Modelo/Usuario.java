/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author maxi
 */
public class Usuario {
    
    private String User;     
  private String Pass;          

  public Usuario(){         
    User="";         
    Pass="";     
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
}
