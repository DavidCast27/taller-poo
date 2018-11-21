package co.com.bancolombia.certificacion.ejercicio1.model;

public class Punto {

    private double coorX;
    private double coorY;

    public Punto(double coorX, double coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public double getCoorX() {
        return coorX;
    }

    public void setCoorX(double coorX) {
        this.coorX = coorX;
    }

    public double getCoorY() {
        return coorY;
    }

    public void setCoorY(double coorY) {
        this.coorY = coorY;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "coorX=" + coorX +
                ", coorY=" + coorY +
                '}';
    }
}
