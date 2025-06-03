package Ejercicio.Nivel_2.Trabajadores;

import Ejercicio.Nivel_1.Empleado;
import Ejercicio.Nivel_1.Producto;
import Ejercicio.Nivel_2.Productos.MaletaViaje;
import Ejercicio.Nivel_2.Productos.Mochila;

public class Cajero extends Empleado {
    public Cajero(String nombre, String id) {
        super(nombre, id, "Cajero");
    }

    public void realizarVenta(Producto p, int cantidad) {
        double subtotal = p.getPrecio() * cantidad;
        if (p instanceof Mochila) subtotal *= 0.90;
        if (p instanceof MaletaViaje) subtotal *= 0.80;
        double total = subtotal * 1.15;
        System.out.println("Venta realizada. Total a pagar: $" + total);
    }

    public void consultarDetalle(Producto p) {
        p.mostrarDetalle();
    }
}
