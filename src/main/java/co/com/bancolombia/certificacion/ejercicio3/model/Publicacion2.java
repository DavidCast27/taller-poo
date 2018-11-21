package co.com.bancolombia.certificacion.ejercicio3.model;

import java.util.Date;

public class Publicacion2 implements Leible2, Leible {

    @Override
    public Date inicioLectura(Date fechaInicio) {
        return null;
    }

    @Override
    public void finLectura(Date fechaInicio, Date fechaFinal) {
        long diferenciaEn_ms = fechaFinal.getTime() - fechaInicio.getTime();
        long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
        System.out.println("te demoraste: " + dias + " dias");

    }
}
