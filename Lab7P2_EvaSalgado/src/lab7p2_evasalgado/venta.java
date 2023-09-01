
package lab7p2_evasalgado;

import java.util.ArrayList;

public class venta {
    ArrayList<vendedor> Vendedor;
    ArrayList<cliente> comprador;
    ArrayList<vehiculo> carrovendido;
    double costo;

    public venta() {
    }

    public venta(ArrayList<vendedor> Vendedor, ArrayList<cliente> comprador, ArrayList<vehiculo> carrovendido, double costo) {
        this.Vendedor = Vendedor;
        this.comprador = comprador;
        this.carrovendido = carrovendido;
        this.costo = costo;
    }

    public ArrayList<vendedor> getVendedor() {
        return Vendedor;
    }

    public void setVendedor(ArrayList<vendedor> Vendedor) {
        this.Vendedor = Vendedor;
    }

    public ArrayList<cliente> getComprador() {
        return comprador;
    }

    public void setComprador(ArrayList<cliente> comprador) {
        this.comprador = comprador;
    }

    public ArrayList<vehiculo> getCarrovendido() {
        return carrovendido;
    }

    public void setCarrovendido(ArrayList<vehiculo> carrovendido) {
        this.carrovendido = carrovendido;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
