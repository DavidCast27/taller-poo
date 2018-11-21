package co.com.bancolombia.certificacion.ejercicio4.model;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> implements ColeccionInterfaz {

    private List<T> lista;


    public Lista() {
        lista = new ArrayList<>();
    }

    @Override
    public boolean estaVacia() {
        return lista.isEmpty();
    }

    @Override
    public Object extraer() {
        T object = lista.get(0);
        return lista.remove(object);
    }

    @Override
    public Object primero() {
        return lista.get(0);
    }

    @Override
    public boolean añadir(Object data) {
        return lista.add((T) data);
    }

}
