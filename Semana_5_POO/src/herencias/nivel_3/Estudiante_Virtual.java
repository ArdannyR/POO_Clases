package herencias.nivel_3;

import herencias.nivel_2.Estudiante;

public class Estudiante_Virtual extends Estudiante {
    String plataforma;
    String tutor_virtual;

    public Estudiante_Virtual(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, String plataforma, String tutor_virtual) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.plataforma = plataforma;
        this.tutor_virtual = tutor_virtual;
    }

    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf("Plataforma: %s\nTutor virtual: %s\n", plataforma, tutor_virtual);
    }

    public void mostrar_edad(int año_nacimiento) {
        super.calculo_de_edad(año_nacimiento);
    }
}
