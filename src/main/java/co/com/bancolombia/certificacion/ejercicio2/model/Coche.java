package co.com.bancolombia.certificacion.ejercicio2.model;

public class Coche {

    private String matricula;
    private String marca;
    private int modelo;

    public Coche() {
        marca = "toyoya";
        modelo = 2018;
    }

    public Coche(String matricula, String marca, int modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
