package modelo;

import java.util.*;

public class SolicitudCompra {
    private static int contador = 1;
    private int numero;
    private EstadoSolicitud estado;
    private List<Producto> productos;
    private List<ItemSolicitud> items;

    public SolicitudCompra() {
        this.numero = contador++;
        this.estado = EstadoSolicitud.SOLICITADA;
        this.productos = new ArrayList<>();
        this.items=new ArrayList<>();
    }
    
    public void agregarItem(ItemSolicitud item) {
        items.add(item);
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public List<ItemSolicitud> getItems() {
        return items;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemSolicitud item : items) {
        total += item.getSubtotal();
        }
        return total;
    }  

    @Override
    public String toString() {
        return "Solicitud #" + numero + " - Estado: " + estado + " - Total: $" + calcularTotal();
    }
}