package Ejercicio;

public class Main {
    public static void main(String[] args) {
        Pais pais_1 = new Pais();

        //pais_1.nombre = "Paris";
        pais_1.setNombre("Paris");
        pais_1.poblacion = 250000;

        //pais_1.info_pais();
        System.out.printf("Nombre: %s \nPoblacion: %d \nContinente: %s\n",pais_1.getNombre(), pais_1.poblacion, pais_1.getContinente());
    }
}
