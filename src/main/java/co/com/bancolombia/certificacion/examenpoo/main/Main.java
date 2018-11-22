package co.com.bancolombia.certificacion.examenpoo.main;

import co.com.bancolombia.certificacion.examenpoo.modelo.Empleado;
import co.com.bancolombia.certificacion.examenpoo.modelo.Persona;
import co.com.bancolombia.certificacion.examenpoo.modelo.Secretaria;
import co.com.bancolombia.certificacion.examenpoo.modelo.Vigilante;

public class Main {

    public static void main (String[] args){

        Persona empleado = new Empleado("david","castrillon","gonzales","tester",2000);


        System.out.println("el empleado duerme " + empleado.dormir("trabajo"));
        System.out.println("el empleado realiza la ronda en " +empleado.realizarTarea("realizar ronda"));

        empleado = new Vigilante("david","castrillon","gonzales",2000);
        System.out.println("el vigilante duerme " + empleado.dormir("casa"));
        System.out.println("el vigilante realiza la ronda en " +empleado.realizarTarea("realizar ronda"));

        empleado = new Empleado("margarita", "primer","segundo", "secretaria", 1000);
        System.out.println("la empleada duerme " + empleado.dormir("casa novio"));
        System.out.println("la empleada envia informe en " +empleado.realizarTarea("hacer informe"));


        empleado = new Secretaria("margarita", "primer","segundo", 1000);
        System.out.println("la secre duerme " + empleado.dormir("casa"));
        System.out.println("la secre envia informe en " +empleado.realizarTarea("hacer informe"));

    }
}
