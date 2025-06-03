package Inicio_de_listas;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Producto> lista_prod = new ArrayList<>();

        lista_prod.add(new Producto("Manzana", "Fruta"));
        lista_prod.add(new Producto("Uva", "Fruta"));
        lista_prod.add(new Producto("Tomate", "Fruta"));
    }
}
