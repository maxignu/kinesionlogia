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
public class Domicilio {

  private int idDomicilio;
  private String barrio;
  private String calle;
  private int numero;

    public Domicilio() {
    }

    public Domicilio(int idDomicilio, String barrio, String calle, Integer numero) {
        this.idDomicilio = idDomicilio;
        this.barrio = barrio;
        this.calle = calle;
        this.numero = numero;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


 

}