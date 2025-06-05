package Ejercicio_2.Main;

import Ejercicio_2.Modelo.Curso;
import Ejercicio_2.Modelo.Entrenador;
import Ejercicio_2.Modelo.Participante;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // Instancias
        Scanner sc = new Scanner(System.in);

        Participante participante_null = new Participante(null, null, 0);
        Participante participante1 = participante_null.pedir_datos(sc);

        Entrenador entrenador_null = new Entrenador(null, null, 0, null);
        Entrenador entrenador1 = entrenador_null.pedir_datos(sc);

        Curso curso_null = new Curso(null, null, 0, 0, null, entrenador1);
        Curso curso1 = curso_null.pedir_datos(sc, entrenador1);

        participante1.mostrar_datos();
        entrenador1.mostrar_datos();
        curso1.inscribir(participante1);
        curso1.mostrar_inscritos();
    }
}
