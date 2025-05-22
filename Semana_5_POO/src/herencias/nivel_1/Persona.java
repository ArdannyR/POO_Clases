package herencias.nivel_1;

public class Persona {
    String cedula;
    String nombre;
    String direccion;
    String correo;
    String telefono;

    public Persona(String cedula, String nombre, String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Este no tiene telefono con el fin de usarse en docente linea
    public Persona(String cedula, String nombre, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void mostrar_info() {
        System.out.printf("*----------------INFO-----------------*\nCedula: %s\nNombre: %s\nDireccion: %s\nCorreo: %s\nTelefono: %s\n", cedula, nombre, direccion, correo, telefono);
    }
}
