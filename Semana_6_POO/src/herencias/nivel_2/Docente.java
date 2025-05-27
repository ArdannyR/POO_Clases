package herencias.nivel_2;

import herencias.nivel_1.Persona;

public class Docente extends Persona {
    String facultad_pertenece;
    int horas_asignadas;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono,String facultad_pertenece, int horas_asignadas) {
        super(cedula, nombre, direccion, correo, telefono);
        this.facultad_pertenece = facultad_pertenece;
        this.horas_asignadas = horas_asignadas;
    }

    // Por ende este de aqui tambien debe no contener telefono
    public Docente(String cedula, String nombre, String direccion, String correo,String facultad_pertenece, int horas_asignadas) {
        super(cedula, nombre, direccion, correo);
        this.facultad_pertenece = facultad_pertenece;
        this.horas_asignadas = horas_asignadas;
    }

    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf("Facultad: %s\nHoras asignadas: %d\n", facultad_pertenece, horas_asignadas);
    }
}
