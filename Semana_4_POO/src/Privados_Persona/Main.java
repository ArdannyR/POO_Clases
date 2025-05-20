package Privados_Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona_1 = new Persona("Jose", 26);
        System.out.printf("Nombre: %s\t Edad: %d años\n", persona_1.getNombre(), persona_1.getEdad());

        persona_1.setNombre("Pablo");
        persona_1.setEdad(27);
        System.out.printf("Nombre: %s\t Edad: %d años\n", persona_1.getNombre(), persona_1.getEdad());
    }
}