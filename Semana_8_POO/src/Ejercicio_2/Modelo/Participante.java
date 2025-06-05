package Ejercicio_2.Modelo;

import java.util.Scanner;

public class Participante extends Persona{

    // Metodos
    public Participante(String nombre, String cedula, int edad){
        super(nombre, cedula,edad);
    }

    @Override
    public void mostrar_datos() {
        System.out.print("\n* * * * * * Participante * * * * * *\n");
        System.out.printf("\nParticipante: %s \nEdad: %d", nombre, edad);
    }

    public Participante pedir_datos(Scanner sc) {
        System.out.print("\n* * * * * * Participante * * * * * *\n");
        System.out.print("Introduce el nombre: "); String nombre_part = sc.nextLine();
        System.out.print("Introduce la cedula: "); String cedula_part = sc.nextLine();
        System.out.print("Introduce la edad: "); int edad_part = sc.nextInt(); sc.nextLine();
        return new Participante(nombre_part, cedula_part, edad_part);
    }
}
