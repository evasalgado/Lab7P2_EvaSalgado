
package lab7p2_evasalgado;

import java.awt.Color;
import java.util.Date;

public class vehiculo {
    private String marca;
    private Color color;
    private String modelo;
    Date año;
    Double precio;

    public vehiculo() {
    }

    public vehiculo(String marca, Color color, String modelo, Date año, Double precio) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return   marca + "," + color + "," + modelo + "," + año + "," + precio ;
    }
    
    
  
}
