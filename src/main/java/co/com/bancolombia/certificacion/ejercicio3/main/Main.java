package co.com.bancolombia.certificacion.ejercicio3.main;


import co.com.bancolombia.certificacion.ejercicio3.model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ejemploPoliformismo();

    }

    public static void ejemploPoliformismo (){
        Publicacion publicacion = new Publicacion(23,"publicacion", "jose", 34);
        publicacion.estaEditado();

        System.out.println("------------------------------------");
        Libro libro = new Libro( 23,"harry potter", "antonio",39,"123456789");
        publicacion = libro;
        publicacion.estaEditado();
        System.out.println("------------------------------------");
        Revista revista = new Revista(23,"vea","jairo",54,"32");
        publicacion = revista;
        publicacion.estaEditado();


        Leible leible = new Publicacion(12,"algo", "autores",10);
        leible.inicioLectura(new Date());


        leible = new Publicacion2();

        leible.inicioLectura(new Date());

    }
}
