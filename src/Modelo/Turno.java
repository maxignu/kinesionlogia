
package Modelo;

import java.util.Date;

/**
 *
 * @author maxi
 */
public class Turno {

  private int id;
  private Date fecha;
  private Date hora;
  private boolean estado;
  private int nrosesion;

    public Turno() {
    }

    public Turno(int id, Date fecha, Date hora, boolean estado, int nrosesion) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.nrosesion = nrosesion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNrosesion() {
        return nrosesion;
    }

    public void setNrosesion(int nrosesion) {
        this.nrosesion = nrosesion;
    }
 
}