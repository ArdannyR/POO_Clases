package Public_Persona_save;

public class Main {
    public static void main(String[] args) {
        //Persona persona_1 = new Privados_Persona.Persona("Ardanny",20);
        //Sin el metodo constructor, toca definir afuera de la instancia
        Persona persona_1 = new Persona();
        //Persona persona_2 = new Persona("Arda");

        persona_1.nombre = "Ardanny";
        persona_1.edad = 20;

        persona_1.Cambiar_Nombre(persona_1.nombre, persona_1.edad);
        persona_1.Cambiar_Nombre("Esau",21);
        //persona_2.Cambiar_Nombre(persona_2.nombre, persona_2.edad);
    }
}