package co.com.bancolombia.certificacion.ejercicio1.model;

public class Circulo extends Elipse {


    public Circulo(String color, Punto centro, String nombre, double radio) {
        super(color, centro, nombre, radio, radio);
    }

    public void setRadio (double radio){
        setRadioMayor(radio);
        setRadioMenor(radio);
    }

    public double getRadio (){
        return getRadioMenor();
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio = " + getRadioMayor() +
                "}";
    }
}
