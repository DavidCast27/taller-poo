package co.com.bancolombia.certificacion.examenpoo.modelo;

public class Tarea {

    private String nombreTarea;
    private double tiempoTarea;

    public Tarea(String nombreTarea, double tiempoTarea) {
        this.nombreTarea = nombreTarea;
        this.tiempoTarea = tiempoTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public double getTiempoTarea() {
        return tiempoTarea;
    }

    public void setTiempoTarea(double tiempoTarea) {
        this.tiempoTarea = tiempoTarea;
    }
}
