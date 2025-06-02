package modelo;

public class ItemSolicitud {
    private Producto producto;
    private int cantidadSolicitada;

    public ItemSolicitud(Producto producto, int cantidadSolicitada) {
        this.producto = producto;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public double getSubtotal() {
        return producto.getPrecio() * cantidadSolicitada;
    }
}
