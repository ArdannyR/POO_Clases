package Public_Persona_save;

public class Persona {
    public String nombre; //atributo publico
    public int edad;

    /*
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }*/

    public void Cambiar_Nombre(String new_nombre, int new_edad) {
        nombre = new_nombre; //cuando tenemos diferentes nombres de caracteristicas, el this. no importaria
        edad = new_edad;
        System.out.printf("Nombre: %s \t Edad: %d\n",nombre,edad);
    }
}