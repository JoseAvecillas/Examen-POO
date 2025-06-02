package servicio;

import modelo.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class GestionProveedor {
    private List<Proveedor> proveedores = new ArrayList<>();

    public void agregarProveedor(Proveedor p) {
        proveedores.add(p);
    }

    public List<Proveedor> listarProveedores() {
        return proveedores;
    }

    public Proveedor buscarPorId(String id) {
        for (Proveedor p : proveedores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
}