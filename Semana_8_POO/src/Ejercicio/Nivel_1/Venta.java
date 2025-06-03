package Ejercicio.Nivel_1;

import java.time.LocalDate;

public class Venta { //
    private String codigoProducto; //
    private String descripcionProducto; //
    private int cantidadVendida; //
    private double totalVenta; //
    private LocalDate fechaVenta; //

    public Venta(String codigoProducto, String descripcionProducto, int cantidadVendida, double totalVenta, LocalDate fechaVenta) { //
        this.codigoProducto = codigoProducto; //
        this.descripcionProducto = descripcionProducto; //
        this.cantidadVendida = cantidadVendida; //
        this.totalVenta = totalVenta; //
        this.fechaVenta = fechaVenta; //
    }

    public void mostrarDetalleVenta() { //
        System.out.println("Producto: " + descripcionProducto + " (" + codigoProducto + ")"); //
        System.out.println("Cantidad: " + cantidadVendida); //
        System.out.println("Total: $" + totalVenta); //
        System.out.println("Fecha: " + fechaVenta); //
        System.out.println("--------------------"); //
    }
}
