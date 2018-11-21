package co.com.bancolombia.certificacion.ejercicio4.model;

public interface ColeccionInterfaz <T> {

    boolean estaVacia();
    T extraer();
    T primero();
    boolean añadir(T data);
}
