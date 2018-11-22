package co.com.bancolombia.certificacion.examenpoo.modelo;

public class Vigilante extends Empleado{

    private String tipoDeTurno;
    private boolean prestoServicioMilitar;
    private static final String CARGO = "VIGILANTE";
    private static final String TIPO_TURNO_DEFECTO = "DIURNO";
    private static final String TAREA_DEFECTO = "realizar ronda";


    public Vigilante(String nombre, String apellidoPaterno, String apellidoMaterno, double salario, String tipoDeTurno, boolean prestoServicioMilitar) {
        super(nombre, apellidoPaterno, apellidoMaterno,CARGO, salario);
        this.tipoDeTurno = tipoDeTurno;
        this.prestoServicioMilitar = prestoServicioMilitar;
        super.realizarTarea(TAREA_DEFECTO);
    }

    public Vigilante(String nombre, String apellidoPaterno, String apellidoMaterno, double salario, String tipoDeTurno) {
        super(nombre, apellidoPaterno, apellidoMaterno, CARGO, salario);
        this.tipoDeTurno = tipoDeTurno;
    }

    public Vigilante(String nombre, String apellidoPaterno, String apellidoMaterno, double salario) {
        super(nombre, apellidoPaterno, apellidoMaterno, CARGO, salario);
        prestoServicioMilitar = true;
        tipoDeTurno = TIPO_TURNO_DEFECTO;
    }

    public void cambiarTipoDeTurno(String tipoDeTurno){
        setTipoDeTurno(tipoDeTurno);
    }

    @Override
    public double realizarTarea (String nombreTarea){
        return 3;
    }

    public String getTipoDeTurno() {
        return tipoDeTurno;
    }

    public void setTipoDeTurno(String tipoDeTurno) {
        this.tipoDeTurno = tipoDeTurno;
    }

    public boolean isPrestoServicioMilitar() {
        return prestoServicioMilitar;
    }

    public void setPrestoServicioMilitar(boolean prestoServicioMilitar) {
        this.prestoServicioMilitar = prestoServicioMilitar;
    }
}
