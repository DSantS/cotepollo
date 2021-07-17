/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotehakemate;

/**
 *
 * @author SEBCOM
 */
public class cls_registro {
    private String anillo;
    private String nombre;
    private String tipo;
    private String color;
    private double peso;

    public cls_registro(String anillo, String nombre, String tipo, String color, double peso) {
        this.anillo = anillo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
    }

    public String getAnillo() {
        return anillo;
    }

    public void setAnillo(String anillo) {
        this.anillo = anillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}

