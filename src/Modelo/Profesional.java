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
public class Profesional extends Persona {

  private int idProfesional;
  private String tipoProfesional;
  private Integer matricula;
  private boolean estado;

    public Profesional() {
    }

    public Profesional(int idProfesional, String tipoProfesional, Integer matricula, boolean estado) {
        this.idProfesional = idProfesional;
        this.tipoProfesional = tipoProfesional;
        this.matricula = matricula;
        this.estado = estado;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getTipoProfesional() {
        return tipoProfesional;
    }

    public void setTipoProfesional(String tipoProfesional) {
        this.tipoProfesional = tipoProfesional;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   }