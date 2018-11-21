package co.com.bancolombia.certificacion.ejercicio1.model;

 abstract public class Forma {

    private String color;
    private Punto centro;
    private String nombre;

    public Forma(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    public abstract double area();
    public abstract double perimetro();
    public abstract void tamaño (double factorEscalar);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "color='" + color + '\'' +
                ", centro=" + centro.toString() +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

