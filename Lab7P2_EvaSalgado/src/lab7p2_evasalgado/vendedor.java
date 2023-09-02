
package lab7p2_evasalgado;

import java.awt.Color;

public class vendedor {
    private String Nombre;
    private int carrosvendidos;
    private double dinerogenerado;

    public vendedor() {
    }

    public vendedor(String Nombre, int carrosvendidos, double dinerogenerado) {
        this.Nombre = Nombre;
        this.carrosvendidos = carrosvendidos;
        this.dinerogenerado = dinerogenerado;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCarrosvendidos() {
        return carrosvendidos;
    }

    public void setCarrosvendidos(int carrosvendidos) {
        this.carrosvendidos = carrosvendidos;
    }

    public double getDinerogenerado() {
        return dinerogenerado;
    }

    public void setDinerogenerado(double dinerogenerado) {
        this.dinerogenerado = dinerogenerado;
    }

    @Override
    public String toString() {
        return  Nombre + "," + carrosvendidos + ", " + dinerogenerado ;
    }
    
    
}
