
public class Uso_de_clases {
    public static void main(String[] args) {

        //Una clase da un objeto, objetos se componen de atributos y metodos (Instancias es replica de la clase, son las creaciones de los objetos / copias)
        //Una clase puede ser una plantilla que se reutiliza para diferentes objetos
        //Atributo son variables/caracteristicas/propiedades, Metodos son acciones que pueden hacer los objetos
        //No puede haber metodos sin un objeto
        //Si no se tiene una clase, se da la programacion no reutlizable

        Personas p1 = new Personas("Ardanny", 20);
        p1.saludar();
        p1.nacimiento();
    }
}