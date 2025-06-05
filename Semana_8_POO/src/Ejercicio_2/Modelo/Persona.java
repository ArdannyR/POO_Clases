package Ejercicio_2.Modelo;

import java.util.stream.Stream;

public abstract class Persona {
    // Atributos
    protected String nombre;
    protected String cedula;
    protected int edad;

    // Metodos
    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public abstract void mostrar_datos(); // Esto de aqui obliga a que las clases hijas usen este metodo

    // Set & Get (Por el momento esto no deberia ser necesario)
    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}

    public String getCedula() { return cedula;}
    public void setCedula(String cedula) { this.cedula = cedula;}

    public int getEdad() { return edad;}
    public void setEdad(int edad) { this.edad = edad;}

}
