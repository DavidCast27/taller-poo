package co.com.bancolombia.certificacion.ejercicio1.main;

import co.com.bancolombia.certificacion.ejercicio1.model.Circulo;
import co.com.bancolombia.certificacion.ejercicio1.model.Forma;
import co.com.bancolombia.certificacion.ejercicio1.model.Punto;
import co.com.bancolombia.certificacion.ejercicio1.model.Rectangulo;

public class main {


    public static void main (String[] args){
        ejemploRectangulo();

    }


    public static void ejemploRectangulo(){

        Punto centro = new Punto(0,0);
        String color = "negro";
        String nombre = "mi rectangulo";
        double ladoMayor = 40;
        double ladoMenor = 10;

        Forma rectangulo = new Rectangulo(color,centro,nombre, ladoMayor,ladoMenor);
        System.out.println(rectangulo.toString());
        System.out.println("perimetro antes del factor " +  rectangulo.perimetro());
        System.out.println("area antes del factor " + rectangulo.area());

        //rectangulo.tamaño(2);
        //System.out.println(rectangulo.toString());
        //System.out.println("perimetro despues del factor 2 " +  rectangulo.perimetro());
        //System.out.println("area 2 del factor 2 " + rectangulo.area());


        rectangulo.tamaño(0.5);
        System.out.println(rectangulo.toString());
        System.out.println("perimetro despues del factor 0.5 " +  rectangulo.perimetro());
        System.out.println("area 2 del factor 0.5 " + rectangulo.area());


    }
}
