package co.com.bancolombia.certificacion.examenpoo.modelo;

public class Secretaria extends Empleado {

    private static final String CARGO = "Secretaria";
    public Secretaria(String nombre, String apellidoPaterno, String apellidoMaterno, double salario) {
        super(nombre, apellidoPaterno, apellidoMaterno, CARGO, salario);
    }

    @Override
    public double realizarTarea(String nombreTarea) {
        return 1;
    }
}
