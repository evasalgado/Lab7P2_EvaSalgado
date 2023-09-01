
package lab7p2_evasalgado;


public class cliente {
    String nombre;
    int edad;
    String profesion;
    int carroscomprados;
    double sueldodisponible;

    public cliente() {
    }

    public cliente(String nombre, int edad, String profesion, int carroscomprados, double sueldodisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.carroscomprados = carroscomprados;
        this.sueldodisponible = sueldodisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCarroscomprados() {
        return carroscomprados;
    }

    public void setCarroscomprados(int carroscomprados) {
        this.carroscomprados = carroscomprados;
    }

    public double getSueldodisponible() {
        return sueldodisponible;
    }

    public void setSueldodisponible(double sueldodisponible) {
        this.sueldodisponible = sueldodisponible;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", carroscomprados=" + carroscomprados + ", sueldodisponible=" + sueldodisponible + '}';
    }
    
    
}
