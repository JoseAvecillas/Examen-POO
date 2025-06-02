package modelo;

public class Producto implements Calculable {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }

    @Override
    public double calcularCostoTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + cantidad + " unidades - $" + calcularCostoTotal();
    }
}