package co.com.bancolombia.certificacion.ejercicio3.model;

public class Libro extends Publicacion{

    private String isbn;
    public String editorial;

    public Libro(long id, String nombre, String autores, int numeroDePaginas, String isbn) {
        super(id, nombre, autores, numeroDePaginas);
        this.isbn = isbn;
        this.editorial = "libro";
    }

    @Override
    public void estaEditado(){
        System.out.println("la editorial es " + editorial);
        System.out.println("el isbn es "+ isbn);
    }

    @Override
    public boolean esLeido() {
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
