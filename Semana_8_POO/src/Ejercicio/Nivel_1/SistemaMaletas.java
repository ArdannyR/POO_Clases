package Ejercicio.Nivel_1;

import Ejercicio.Nivel_2.Trabajadores.Administrador;
import Ejercicio.Nivel_2.Productos.Bolso;
import Ejercicio.Nivel_2.Trabajadores.Cajero;
import Ejercicio.Nivel_2.Trabajadores.Gerente;
import Ejercicio.Nivel_2.Productos.Lonchera;
import Ejercicio.Nivel_2.Productos.MaletaViaje;
import Ejercicio.Nivel_2.Productos.Mochila;
import Ejercicio.Nivel_2.Trabajadores.PersonalLimpieza;
import Ejercicio.Nivel_2.Trabajadores.Vendedor;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class SistemaMaletas {
    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Venta> historialVentas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDatos();

        Cajero cajero1 = (Cajero) empleados.get(0);
        Cajero cajero2 = (Cajero) empleados.get(1);
        Vendedor vendedor1 = (Vendedor) empleados.get(2);

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Consultar detalle del producto por código (Cajero/Vendedor)"); // Changed description
            System.out.println("2. Consultar precio (Cliente)");
            System.out.println("3. Realizar venta (Cajero)");
            System.out.println("4. Ver todos los productos");
            System.out.println("5. Ver empleados registrados");
            System.out.println("6. Agregar nuevo producto (Administrador)");
            System.out.println("7. Mostrar productos con stock bajo");
            System.out.println("8. Mostrar historial de ventas");
            System.out.println("9. Consultar detalle del producto por descripción (Cajero/Vendedor)"); // New option
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1 -> consultarDetalle();
                case 2 -> clienteConsultar();
                case 3 -> realizarVenta(cajero1);
                case 4 -> mostrarTodos();
                case 5 -> mostrarEmpleados();
                case 6 -> agregarProducto();
                case 7 -> mostrarProductosBajoStock();
                case 8 -> mostrarHistorialVentas();
                case 9 -> { // New case for overloaded method
                    sc.nextLine(); // consume newline
                    System.out.print("Ingrese la descripción del producto: "); //
                    String desc = sc.nextLine(); //
                    consultarDetalle(desc); // Call the overloaded method
                }
            }
        } while(opcion != 0);
    }

    static void inicializarDatos() {
        // Productos
        productos.add(new Mochila("M01", "Mochila Escolar", "Estante A", 10, 20.5));
        productos.add(new Bolso("B01", "Bolso Mujer", "Estante B", 5, 35.0));
        productos.add(new MaletaViaje("MV01", "Maleta de Viaje", "Estante C", 3, 60.0));
        productos.add(new Lonchera("L01", "Lonchera Niños", "Estante D", 12, 15.0));

        // Empleados
        empleados.add(new Cajero("Carlos", "C01"));
        empleados.add(new Cajero("Laura", "C02"));
        empleados.add(new Vendedor("Luis", "V01"));
        empleados.add(new Vendedor("Ana", "V02"));
        empleados.add(new Vendedor("Mario", "V03"));
        empleados.add(new Administrador("Lucia", "A01"));
        empleados.add(new Gerente("Raul", "G01"));
        empleados.add(new PersonalLimpieza("Pablo", "L01"));
        empleados.add(new PersonalLimpieza("Sofia", "L02"));
    }

    static Producto buscarProducto(String codigo) {
        for (Producto p : productos)
            if (p.getCodigo().equalsIgnoreCase(codigo))
                return p;
        return null;
    }

    // Original method
    static void consultarDetalle() {
        System.out.print("Ingrese el código del producto: ");
        String cod = sc.next();
        Producto p = buscarProducto(cod);
        if (p != null) p.mostrarDetalle();
        else System.out.println("Producto no encontrado.");
    }

    // Overloaded method
    static void consultarDetalle(String descripcion) { //
        System.out.println("\n--- BUSCANDO PRODUCTO POR DESCRIPCIÓN ---"); //
        boolean found = false; //
        for (Producto p : productos) { //
            if (p.getDescripcion().toLowerCase().contains(descripcion.toLowerCase())) { //
                p.mostrarDetalle(); //
                found = true; //
            }
        }
        if (!found) { //
            System.out.println("No se encontraron productos con esa descripción."); //
        }
    }

    static void clienteConsultar() {
        System.out.print("Ingrese el código del producto: ");
        String cod = sc.next();
        Producto p = buscarProducto(cod);
        if (p != null) p.mostrarPrecio();
        else System.out.println("Producto no encontrado.");
    }

    static void realizarVenta(Cajero c) {
        System.out.print("Ingrese el código del producto: ");
        String cod = sc.next();
        Producto p = buscarProducto(cod);
        if (p != null) {
            System.out.print("Cantidad a comprar: ");
            int cant = sc.nextInt();
            Venta venta = c.realizarVenta(p, cant);
            if (venta != null) {
                historialVentas.add(venta);
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    static void agregarProducto() {
        System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
        System.out.print("Tipo de producto (Mochila, Bolso, MaletaViaje, Lonchera): ");
        String tipo = sc.next();
        System.out.print("Código: ");
        String codigo = sc.next();
        sc.nextLine(); // consume newline
        System.out.print("Descripción: ");
        String descripcion = sc.nextLine();
        System.out.print("Ubicación: ");
        String ubicacion = sc.nextLine();
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        Producto nuevoProducto = null;
        switch (tipo.toLowerCase()) {
            case "mochila":
                nuevoProducto = new Mochila(codigo, descripcion, ubicacion, stock, precio);
                break;
            case "bolso":
                nuevoProducto = new Bolso(codigo, descripcion, ubicacion, stock, precio);
                break;
            case "maletaviaje":
                nuevoProducto = new MaletaViaje(codigo, descripcion, ubicacion, stock, precio);
                break;
            case "lonchera":
                nuevoProducto = new Lonchera(codigo, descripcion, ubicacion, stock, precio);
                break;
            default:
                System.out.println("Tipo de producto no reconocido.");
        }

        if (nuevoProducto != null) {
            productos.add(nuevoProducto);
            System.out.println("Producto agregado exitosamente.");
        }
    }

    static void mostrarProductosBajoStock() {
        System.out.println("\n--- PRODUCTOS CON BAJO STOCK (MENOS DE 3 UNIDADES) ---");
        boolean found = false;
        for (Producto p : productos) {
            if (p.getStock() < 3) {
                p.mostrarDetalle();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hay productos con stock menor a 3 unidades.");
        }
    }

    static void mostrarHistorialVentas() {
        System.out.println("\n--- HISTORIAL DE VENTAS ---");
        if (historialVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta v : historialVentas) {
                v.mostrarDetalleVenta();
            }
        }
    }

    static void mostrarTodos() {
        for (Producto p : productos) p.mostrarDetalle();
    }

    static void mostrarEmpleados() {
        for (Empleado e : empleados) e.mostrarInfo();
    }
}