package co.com.bancolombia.certificacion.ejercicio3.model;

import java.util.Date;

public class Publicacion implements Leible, Leible2{
    private long id;
    private String nombre;
    private String autores;
    private int numeroDePaginas;
    public String editorial;

    public Publicacion(long id, String nombre, String autores, int numeroDePaginas) {
        this.id = id;
        this.nombre = nombre;
        this.autores = autores;
        this.numeroDePaginas = numeroDePaginas;
        this.editorial = "Publicacion";
    }

    public void estaEditado(){
        System.out.println("soy el padre");
    }

    public boolean esLeido(){
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public Date inicioLectura(Date fechaInicio) {
        return new Date();
    }

    @Override
    public void finLectura(Date fechaInicio, Date fechaFinal) {
        System.out.println("acabaste tu lectura");
    }
}
