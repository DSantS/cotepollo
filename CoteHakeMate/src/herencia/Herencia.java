/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Sebastian
 */
public class Herencia {

  private String fecha_caducidad;
  private String lote;
  private String fecha_envasada;
  private String pais_origen;
  private String temperatura;
  private String producto;

    public Herencia(String fecha_caducidad, String lote, String fecha_envasada, String pais_origen, String producto) {
        this.fecha_caducidad = fecha_caducidad;
        this.lote = lote;
        this.fecha_envasada = fecha_envasada;
        this.pais_origen = pais_origen;
        this.producto = producto;
    }

   

    

    public Herencia(String fecha_caducidad, String lote, String fecha_envasada, String pais_origen, String temperatura, String producto) {
        this.fecha_caducidad = fecha_caducidad;
        this.lote = lote;
        this.fecha_envasada = fecha_envasada;
        this.pais_origen = pais_origen;
        this.temperatura = temperatura;
        this.producto = producto;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFecha_envasada() {
        return fecha_envasada;
    }

    public void setFecha_envasada(String fecha_envasada) {
        this.fecha_envasada = fecha_envasada;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

   

    
}

