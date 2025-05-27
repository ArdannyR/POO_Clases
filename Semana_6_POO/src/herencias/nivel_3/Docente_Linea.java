package herencias.nivel_3;

import herencias.nivel_2.Docente;

public class Docente_Linea extends Docente {
    String tipo_contacto;

    public Docente_Linea(String cedula, String nombre, String direccion, String correo, String facultad_pertenece, int horas_asignadas, String tipo_contacto) {
        super(cedula, nombre, direccion, correo, facultad_pertenece, horas_asignadas);
        this.tipo_contacto = tipo_contacto;
    }

    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf(" * Tipo de contacto: %s\n", tipo_contacto);
    }
}
