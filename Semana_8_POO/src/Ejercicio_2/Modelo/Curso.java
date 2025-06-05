package Ejercicio_2.Modelo;

import java.util.*;

public class Curso {
    // Atributos
    private String nombre;
    private String disciplina;
    private int edad_max;
    private int edad_min;
    private String horario;
    private Entrenador entrenador;
    private List<Participante> inscritos;

    // Metodos
    public Curso(String nombre, String disciplina, int edad_max, int edad_min, String horario, Entrenador entrenador) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.edad_max = edad_max;
        this.edad_min = edad_min;
        this.horario = horario;
        this.entrenador = entrenador;
        this.inscritos = new ArrayList<>();
    }

    public boolean inscribir(Participante participante) {
        if (inscritos.size() < 30 && participante.getEdad() >= edad_min && participante.getEdad() <= edad_max) {
            inscritos.add(participante);
            return inscritos.contains(participante); // Esto es un True jsjsjsjs
        }
        return false;
    }

    public void mostrar_inscritos() {
        System.out.printf("\n* * * * * * * Curso * * * * * * *\n");
        System.out.printf("\nCurso: %s \nDisciplina: %s\n--Inscritos: \n", nombre, disciplina);
        int numeracion = 1;
        for (Participante participante : inscritos) {
            System.out.printf("\t%d. %s\n", numeracion, participante.getNombre());
        }
    }

    public Curso pedir_datos(Scanner sc, Entrenador entrenador) {
        System.out.printf("\n* * * * * * * Curso * * * * * * *\n");
        System.out.print("Introduce el nombre: "); String nombre_cur = sc.nextLine();
        System.out.print("Introduce la diciplina: "); String diciplina_cur = sc.nextLine();
        System.out.print("Introduce la edad maxima: "); int edad_max = sc.nextInt(); sc.nextLine();
        System.out.print("Introduce la edad minimo: "); int edad_min = sc.nextInt(); sc.nextLine();
        System.out.print("Introduce el Horario: "); String horario = sc.nextLine();
        return new Curso(nombre_cur, diciplina_cur, edad_max, edad_min, horario, entrenador);
    }
}



