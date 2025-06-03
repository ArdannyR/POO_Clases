package Ejercicio.Nivel_2.Trabajadores;

import Ejercicio.Nivel_1.Empleado;
import Ejercicio.Nivel_1.Producto;
import Ejercicio.Nivel_1.Venta; // Import Venta
import Ejercicio.Nivel_2.Productos.MaletaViaje;
import Ejercicio.Nivel_2.Productos.Mochila;

import java.time.LocalDate; // Import LocalDate

public class Cajero extends Empleado {
    public Cajero(String nombre, String id) {
        super(nombre, id, "Cajero");
    }

    public Venta realizarVenta(Producto p, int cantidad) { // Change return type to Venta
        if (p.getStock() >= cantidad) {
            double subtotal = p.getPrecio() * cantidad;
            if (p instanceof Mochila) subtotal *= 0.90;
            if (p instanceof MaletaViaje) subtotal *= 0.80;
            double total = subtotal * 1.15;
            p.setStock(p.getStock() - cantidad);
            System.out.println("Venta realizada. Total a pagar: $" + total);
            System.out.println("Nuevo stock para " + p.getDescripcion() + ": " + p.getStock());
            return new Venta(p.getCodigo(), p.getDescripcion(), cantidad, total, LocalDate.now()); // Return Venta object
        } else {
            System.out.println("No hay suficiente stock para realizar la venta de " + p.getDescripcion());
            return null; // Return null if sale not possible
        }
    }

    public void consultarDetalle(Producto p) {
        p.mostrarDetalle();
    }
}