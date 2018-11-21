package co.com.bancolombia.certificacion.ejercicio1.model;

public class Rectangulo extends Forma {

    private double ladoMayor;
    private double ladoMenor;


    public Rectangulo(String color, Punto centro, String nombre, double ladoMayor, double ladoMenor) {
        super(color, centro, nombre);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public double area (){
        return ladoMenor * ladoMayor;
    }

    public double perimetro (){
        return (2 * ladoMenor) + (2 * ladoMayor);
    }

    public void tamaño (double factorEscalar){
        setLadoMayor(this.ladoMayor * factorEscalar);
        setLadoMenor(this.ladoMenor * factorEscalar);
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                super.toString() +
                "ladoMayor=" + ladoMayor +
                ", ladoMenor=" + ladoMenor +
                '}';
    }
}
