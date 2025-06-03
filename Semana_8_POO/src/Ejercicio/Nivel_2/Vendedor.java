package Nivel_2;

class Vendedor extends Empleado {
    public Vendedor(String nombre, String id) {
        super(nombre, id, "Vendedor");
    }

    public void consultarDetalle(Producto p) {
        p.mostrarDetalle();
    }
}
