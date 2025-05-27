package SistemaCuentasPOO_java;

public class Cliente {
    private String nombre;
    private int edad;
    private boolean tieneNomina;

    public Cliente(String nombre, int edad, boolean tieneNomina) {
        this.nombre = nombre;
        this.edad = edad;
        this.tieneNomina = tieneNomina;
    }

    public int getEdad() {
        return edad;
    }

    public boolean tieneNomina() {
        return tieneNomina;
    }

    public String getNombre() {
        return nombre;
    }
}