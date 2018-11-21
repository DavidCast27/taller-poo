package co.com.bancolombia.certificacion.ejercicio2.model;

public class Empleado extends Persona{


    private int anioAntiguedad;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellido, dni, direccion, telefono);
        this.salario = salario;
    }

    public void incrementarSalario(double incremento){
        salario = salario * (1 + incremento);
    }

    public int getAnioAntiguedad() {
        return anioAntiguedad;
    }

    public void setAnioAntiguedad(int anioAntiguedad) {
        this.anioAntiguedad = anioAntiguedad;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                super.toString() +
                ", anioAntiguedad=" + anioAntiguedad +
                ", salario=" + salario +
                ", supervisor=" + supervisor.getNombre() +
                '}';
    }
}
