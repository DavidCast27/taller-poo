package co.com.bancolombia.certificacion.examenpoo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{

    private String cargo;
    private double salario;
    private List<Tarea> tareas;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String cargo, double salario) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.cargo = cargo;
        this.salario = salario;
        tareas = llenarTareas();

    }

    public Empleado(String cargo, double salario) {
        super();
        this.cargo = cargo;
        this.salario = salario;
        tareas = llenarTareas();
    }

    public Empleado (){
        cargo = "";
        salario = 0;
    }

    public double realizarTarea(String nombreTarea){
        double result = -1;
        for (Tarea tarea: tareas) {
            if(nombreTarea.equalsIgnoreCase(tarea.getNombreTarea())){
                result = tarea.getTiempoTarea();
                break;
            }
        }
        return result;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    private List<Tarea> llenarTareas(){
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("realizar ronda", 6));
        tareas.add(new Tarea("hacer informe", 3));
        tareas.add(new Tarea("automatizar", 10));
        return tareas;
    }
}
