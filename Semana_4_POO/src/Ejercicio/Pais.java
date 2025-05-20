package Ejercicio;

public class Pais {
    private String nombre;
    public int poblacion;
    private String continente;

    public Pais() {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.continente = "Europa";
    }

    public void info_pais() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
}
