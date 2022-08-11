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
public class Paciente extends Persona {

  private int idPaciente;
  private boolean estado;
  private Persona persona;
  private Turno turno;

    public Paciente() {
    }

    public Paciente(int idPaciente, boolean estado, Persona persona, Turno turno) {
        this.idPaciente = idPaciente;
        this.estado = estado;
        this.persona = persona;
        this.turno = turno;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", estado=" + estado + ", persona=" + persona + ", turno=" + turno + '}';
    }
  
  

    

}