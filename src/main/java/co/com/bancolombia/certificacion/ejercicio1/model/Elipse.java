package co.com.bancolombia.certificacion.ejercicio1.model;

public class Elipse extends Forma{
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, Punto centro, String nombre, double radioMayor, double radioMenor) {
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }



    @Override
    public double area() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double perimetro() {
        return Math.PI * (3 * (radioMenor + radioMayor) - Math.sqrt((3*radioMayor+radioMenor)*(radioMayor + 3*radioMenor)));
    }

    @Override
    public void tamaño(double factorEscalar) {
        setRadioMayor(this.radioMayor*factorEscalar);
        setRadioMenor(this.radioMenor*factorEscalar);
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    @Override
    public String toString() {
        return "Elipse{" +
                super.toString() +
                "radioMayor=" + radioMayor +
                ", radioMenor=" + radioMenor +
                '}';
    }
}
