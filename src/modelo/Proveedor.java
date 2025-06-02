package modelo;

public class Proveedor extends Persona {
    private String empresa;

    public Proveedor(String id, String nombre, String empresa) {
        super(id, nombre);
        this.empresa = empresa;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Proveedor: " + nombre + " | Empresa: " + empresa);
    }
}