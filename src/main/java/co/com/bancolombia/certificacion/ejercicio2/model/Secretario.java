package co.com.bancolombia.certificacion.ejercicio2.model;

public class Secretario extends Empleado {

    private String despacho;
    private String numeroFax;
    private static final double INCREMENTO_ANUAL = 0.05;
    private static final String PUESTO = "Secretario";


    public Secretario(String nombre, String apellido, String dni, String direccion, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    public void incrementarSalario(){
        incrementarSalario(INCREMENTO_ANUAL);
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                super.toString() +
                ", despacho='" + despacho + '\'' +
                ", numeroFax='" + numeroFax + '\'' +
                ", Puesto='" + PUESTO + '\'' +
                "}\n";
    }


}
