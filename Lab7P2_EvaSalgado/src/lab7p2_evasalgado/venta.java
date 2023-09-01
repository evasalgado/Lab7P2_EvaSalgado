
package lab7p2_evasalgado;

import java.util.ArrayList;

public class venta {
    String Vendedor;
    String comprador;
    String carrovendido;
    double costo;

    public venta() {
    }

    public venta(String Vendedor, String comprador, String carrovendido, double costo) {
        this.Vendedor = Vendedor;
        this.comprador = comprador;
        this.carrovendido = carrovendido;
        this.costo = costo;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getCarrovendido() {
        return carrovendido;
    }

    public void setCarrovendido(String carrovendido) {
        this.carrovendido = carrovendido;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "venta{" + "Vendedor=" + Vendedor + ", comprador=" + comprador + ", carrovendido=" + carrovendido + ", costo=" + costo + '}';
    }

   
    
    
}
