package Ejercicio.Nivel_1;

public abstract class Empleado { //cambio a public
    protected String nombre;
    protected String id;
    protected String rol;

    public Empleado(String nombre, String id, String rol) {
        this.nombre = nombre;
        this.id = id;
        this.rol = rol;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Rol: " + rol);
    }
}