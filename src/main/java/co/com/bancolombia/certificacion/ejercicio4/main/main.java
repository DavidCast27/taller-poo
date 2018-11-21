package co.com.bancolombia.certificacion.ejercicio4.main;

import co.com.bancolombia.certificacion.ejercicio4.model.ColeccionInterfaz;
import co.com.bancolombia.certificacion.ejercicio4.model.Lista;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main (String[]){
        ColeccionInterfaz<String> milista = new Lista();
        milista.añadir("asa");

        List<String> otraLista = new ArrayList<>();
        otraLista.add("");
    }


}
