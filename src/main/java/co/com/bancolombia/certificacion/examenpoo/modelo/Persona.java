package co.com.bancolombia.certificacion.examenpoo.modelo;

public abstract class Persona {

    protected String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;


    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Persona() {
        nombre = "";
        apellidoMaterno = "";
        apellidoPaterno = "";
    }

    public abstract double realizarTarea(String nombreTarea);

    public double dormir(String lugar){
        return 8;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
