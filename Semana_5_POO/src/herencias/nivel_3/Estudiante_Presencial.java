package herencias.nivel_3;

import herencias.nivel_2.Estudiante;

public class Estudiante_Presencial extends Estudiante {
    int horas_presenciales;
    String horario;

    public Estudiante_Presencial(String cedula, String nombre, String direccion, String correro, String telefono, String carrera, String nivel, String horario, int horas_presenciales) {
        super(cedula, nombre, direccion, correro, telefono, carrera, nivel);
        this.horas_presenciales = horas_presenciales;
        this.horario = horario;
    }

    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf("Horas presenciales: %d\nHorario: %s\n", horas_presenciales, horario);
    }

    public void mostrar_edad(int año_nacimiento) {
        super.calculo_de_edad(año_nacimiento);
    }
}
