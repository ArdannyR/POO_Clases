package Ejercicio.Nivel_2;

import Ejercicio.Nivel_1.Empleado;
import Ejercicio.Nivel_1.Producto;

public class Vendedor extends Empleado {
    public Vendedor(String nombre, String id) {
        super(nombre, id, "Vendedor");
    }

    public void consultarDetalle(Producto p) {
        p.mostrarDetalle();
    }
}
