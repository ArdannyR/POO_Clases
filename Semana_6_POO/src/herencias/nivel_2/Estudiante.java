package herencias.nivel_2;

import herencias.nivel_1.Persona;

public class Estudiante extends Persona {
    String carrera;
    String nivel;

    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel) {
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf("Carrera: %s\nNivel: %s\n", carrera, nivel);
    }

    public void calculo_de_edad(int año_nacimiento){
        int edad = 2025 - año_nacimiento;
        System.out.printf(" * Edad: %d\n", edad);
    }
}
