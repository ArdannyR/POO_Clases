package Cocinero;

import java.util.Scanner;

public class Cocinero {
    String nombre;
    int experiencia;
    String especialidad;

    public Cocinero(String nombre, int experiencia, String especialidad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
    }

    public void mostrar_inofrmacion() {
        System.out.printf("------------------------\nNombre: %s\nExperiencia: %d\nEspecialidad: %s\n", nombre, experiencia, especialidad);
    }

    //Este es el metdo para evitar acumular scanners en el main
    public static Cocinero pedir_datos_cocinero(Scanner sc) {
        System.out.print("------------------------\nIntroduzca el nombre: "); String nombre = sc.nextLine();
        System.out.print("Introduzca los años de experiencia: "); int experiencia = sc.nextInt(); sc.nextLine();  // limpiar el buffer
        System.out.print("Introduzca su especialidad: "); String especialidad = sc.nextLine();

        return new Cocinero(nombre, experiencia, especialidad);
    }
}
