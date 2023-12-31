package lab7p2_evasalgado;

public class cliente {

    private String nombre;
    private int edad;
    private String profesion;
    private int carroscomprados;
    private double sueldodisponible;

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
        try {
            if (edad >= 0) {
                this.edad = edad;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        return  nombre + "," + edad + "," + profesion + "," + carroscomprados + "," + sueldodisponible;
    }

}
