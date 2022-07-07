/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author maxi
 */
public class ObraSocial {

  private int id;
  private String descripcion;
  private String nombre;
  private boolean estado;
  private Turno turno;
  private Paciente paciente;

    public ObraSocial() {
    }

    public ObraSocial(int id, String descripcion, String nombre, boolean estado, Turno turno, Paciente paciente) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.estado = estado;
        this.turno = turno;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
