/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author maxi
 */
public class Diagnostico extends FichaKinesica {

  private int id;
  private String nombreDiag;
  private String descripcion;
  private boolean estado;

    public Diagnostico() {
    }

    public Diagnostico(int id, String nombreDiag, String descripcion, boolean estado) {
        this.id = id;
        this.nombreDiag = nombreDiag;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDiag() {
        return nombreDiag;
    }

    public void setNombreDiag(String nombreDiag) {
        this.nombreDiag = nombreDiag;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

 

}
