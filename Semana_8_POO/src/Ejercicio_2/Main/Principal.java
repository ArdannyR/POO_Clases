package Ejercicio_2.Main;

import Ejercicio_2.Modelo.Curso;
import Ejercicio_2.Modelo.Entrenador;
import Ejercicio_2.Modelo.Participante;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Estan en null para poder llamar los metodos
        Participante participanteActual = null;
        Entrenador entrenadorActual = null;
        Curso cursoActual = null;

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Gestionar Participante");
            System.out.println("2. Gestionar Entrenador");
            System.out.println("3. Gestionar Curso");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: "); opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- GESTIÓN DE PARTICIPANTE ---");
                    System.out.println("1. Crear Participante");
                    System.out.println("2. Mostrar datos de Participante");
                    System.out.print("Ingrese una opción para Participante: "); int opParticipante = sc.nextInt(); sc.nextLine();

                    if (opParticipante == 1) {
                        Participante participante_null = new Participante(null, null, 0);
                        participanteActual = participante_null.pedir_datos(sc);
                        System.out.println("Participante creado exitosamente.");
                    } else if (opParticipante == 2) {
                        if (participanteActual != null) {
                            participanteActual.mostrar_datos();
                        } else {
                            System.out.println("No hay un participante creado todavía. Cree uno primero (Opción 1).");
                        }
                    } else {
                        System.out.println("Opción no válida para Participante.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- GESTIÓN DE ENTRENADOR ---");
                    System.out.println("1. Crear Entrenador");
                    System.out.println("2. Mostrar datos de Entrenador");
                    System.out.print("Ingrese una opción para Entrenador: "); int opEntrenador = sc.nextInt(); sc.nextLine();

                    if (opEntrenador == 1) {
                        Entrenador entrenador_null = new Entrenador(null, null, 0, null);
                        entrenadorActual = entrenador_null.pedir_datos(sc);
                        System.out.println("Entrenador creado exitosamente.");
                    } else if (opEntrenador == 2) {
                        if (entrenadorActual != null) {
                            entrenadorActual.mostrar_datos();
                        } else {
                            System.out.println("No hay un entrenador creado todavía. Cree uno primero (Opción 1).");
                        }
                    } else {
                        System.out.println("Opción no válida para Entrenador.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- GESTIÓN DE CURSO ---");
                    System.out.println("1. Crear Curso");
                    System.out.println("2. Inscribir participante al Curso");
                    System.out.println("3. Mostrar inscritos del Curso");
                    System.out.print("Ingrese una opción para Curso: "); int opCurso = sc.nextInt(); sc.nextLine();

                    if (opCurso == 1) {
                        if (entrenadorActual != null) {
                            Curso curso_null = new Curso(null, null, 0, 0, null, entrenadorActual);
                            cursoActual = curso_null.pedir_datos(sc, entrenadorActual);
                            System.out.println("Curso creado exitosamente.");
                        } else {
                            System.out.println("Debe crear un entrenador primero para asociarlo al curso.");
                        }
                    } else if (opCurso == 2) {
                        if (cursoActual != null && participanteActual != null) {
                            cursoActual.inscribir(participanteActual);
                            System.out.println("Participante inscrito en el curso.");
                        } else {
                            System.out.println("Asegúrese de haber creado un Curso y un Participante antes de inscribir.");
                        }
                    } else if (opCurso == 3) {
                        if (cursoActual != null) {
                            cursoActual.mostrar_inscritos();
                        } else {
                            System.out.println("No hay un curso creado todavía. Cree uno primero (Opción 1).");
                        }
                    } else {
                        System.out.println("Opción no válida para Curso.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 0 y 3.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
