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
public class FichaKinesica extends Profesional {

  private int idFicha;
  private String descripcion;
  private boolean estado;

    public FichaKinesica() {
    }

    public FichaKinesica(int idFicha, String descripcion, boolean estado) {
        this.idFicha = idFicha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
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