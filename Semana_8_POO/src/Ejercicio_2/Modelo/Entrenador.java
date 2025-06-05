package Ejercicio_2.Modelo;

import java.util.Scanner;

public class Entrenador extends Persona{
    // Atributos
    private String disciplina;

    // Metodos
    public Entrenador(String nombre, String cedula, int edad, String disciplina) {
        super(nombre, cedula, edad);
        this.disciplina = disciplina;
    }

    @Override
    public void mostrar_datos(){
        System.out.printf("\n* * * * * * Entrenador * * * * * *\n");
        System.out.printf("\nEntrenador: %s \nDisciplina: %s", nombre, disciplina);
    }

    public Entrenador pedir_datos(Scanner sc) {
        System.out.printf("\n* * * * * * Entrenador * * * * * *\n");
        System.out.print("Introduce el nombre: "); String nombre_entr = sc.nextLine();
        System.out.print("Introduce la cedula: "); String cedula_entr = sc.nextLine();
        System.out.print("Introduce la edad: "); int edad_entr = sc.nextInt(); sc.nextLine();
        System.out.print("Introduce la diciplina: "); String diciplina_entr = sc.nextLine();
        return new Entrenador(nombre_entr, cedula_entr, edad_entr, diciplina_entr);
    }
}
