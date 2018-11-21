package co.com.bancolombia.certificacion.ejercicio2.model;

import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {

    private String despacho;
    private Secretario secretario;
    private List<Vendedor> vendedores;
    private Coche coche;

    private static final double INCREMENTO_ANUAL = 0.2;
    private static final String PUESTO = "Jefe de Zona";


    public JefeZona(String nombre, String apellido, String dni, String direccion, String telefono, double salario, String despacho) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        vendedores = new ArrayList<>();
    }

    public void incrementarSalario(){
        incrementarSalario(INCREMENTO_ANUAL);
    }

    public boolean agregarVendedor(Vendedor vendedor){
        boolean result = false;
        if(buscarVendedor(vendedor.getDni()) != null){
            vendedores.add(vendedor);
            result = true;
        }
        return result;
    }

    public boolean eliminarVendedor(String dni){
        boolean result = false;
        Vendedor clienteAEliminar = buscarVendedor(dni);
        if(clienteAEliminar != null){
            vendedores.remove(clienteAEliminar);
            result = true;
        }
        return result;
    }

    private Vendedor buscarVendedor (String dni){
        return vendedores.stream()
                .filter(vendedor -> dni.equals(vendedor.getDni()))
                .findAny()
                .orElse(null);
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "JefeZona{" +
                super.toString() +
                ", despacho='" + despacho + '\'' +
                ", Puesto='" + PUESTO + '\'' +
                "}\n";
    }
}
