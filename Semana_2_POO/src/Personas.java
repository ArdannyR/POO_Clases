
public class Personas {
    String nombre;
    int edad;

    public Personas (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.printf("Hola, mi nombre es %s y tengo %d",nombre,edad);
    }

    public void nacimiento() {
        int año = 2025 - edad;
        System.out.println(" ");
        System.out.printf("Naci el %d",año);
    }
}