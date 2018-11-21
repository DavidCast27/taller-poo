package co.com.bancolombia.certificacion.ejercicio2.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vendedor extends Empleado {

    private Coche coche;
    private String numeroMovil;
    private String areaVentas;
    private List<Cliente> clientes;
    private double comision;

    private static final double INCREMENTO_ANUAL = 0.1;
    private static final String PUESTO = "Vendedor";

    public Vendedor(String nombre, String apellido, String dni, String direccion, String telefono, double salario, String numeroMovil, double comision) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.numeroMovil = numeroMovil;
        this.comision = comision;
        clientes = new ArrayList<>();
    }

    public void incrementarSalario(){
        incrementarSalario(INCREMENTO_ANUAL);
    }

    public boolean agregarCliente(Cliente cliente){
        boolean result = false;
        if(buscarCliente(cliente.getDni()) == null){
            clientes.add(cliente);
            result = true;
        }
        return result;
    }

    public boolean eliminarCliente(String dni){
        boolean result = false;
        Cliente clienteAEliminar = buscarCliente(dni);
        if(clienteAEliminar != null){
            clientes.remove(clienteAEliminar);
            result = true;
        }
        return result;
    }

    private Cliente buscarCliente (String dni){
        return clientes.stream()
                .filter(cliente -> dni.equals(cliente.getDni()))
                .findAny()
                .orElse(null);
    }

    public int buscar2(String dni){
        int result = -1;
        for (int i = 0; i < clientes.size() ; i++) {
            if(clientes.get(i).getDni().equals(dni)){
                result = i;
                break;
            }
        }
        return  result;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public String getAreaVentas() {
        return areaVentas;
    }

    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                ", numeroMovil='" + numeroMovil + '\'' +
                ", areaVentas='" + areaVentas + '\'' +
                ", comision=" + comision +
                ", Puesto='" + PUESTO + '\'' +
                "}\n";
    }
}
