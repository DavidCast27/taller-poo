package co.com.bancolombia.certificacion.ejercicio3.model;

public class Revista extends Publicacion{

    private String edicion;
    public String editorial;

    public Revista(long id, String nombre, String autores, int numeroDePaginas, String edicion) {
        super(id, nombre, autores, numeroDePaginas);
        this.edicion = edicion;
        this.editorial = "revista";

    }

    @Override
    public void estaEditado(){
        System.out.println("la editorial es: " + editorial);
        System.out.println("la edicion es: " + edicion);
    }
    @Override
    public boolean esLeido(){
        return false;
    }
}
