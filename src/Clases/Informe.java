/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author maxi
 */
public class Informe {

  private int idInforme;
  private Date fecha;
  private String descripcion;

    public Informe() {
    }

    public Informe(int idInforme, Date fecha, String descripcion) {
        this.idInforme = idInforme;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(int idInforme) {
        this.idInforme = idInforme;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


  public void agregar() {
  }

  public void actualizar() {
  }

  public void mostrar() {
  }

  public void eliminar() {
  }

}
