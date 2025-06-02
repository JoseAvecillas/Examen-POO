import modelo.*;
import servicio.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionProveedor gp = new GestionProveedor();
        GestionProducto gprod = new GestionProducto();
        GestionSolicitud gs = new GestionSolicitud();

        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====");
            System.out.println("1. Registrar proveedor");
            System.out.println("2. Registrar producto");
            System.out.println("3. Registrar solicitud de compra");
            System.out.println("4. Listar proveedores");
            System.out.println("5. Listar productos");
            System.out.println("6. Listar solicitudes de compra");
            System.out.println("7. Buscar proveedor por ID");
            System.out.println("8. Buscar producto por nombre");
            System.out.println("9. Buscar solicitud por número");
            System.out.println("10. Aprobar solicitud de compra");
            System.out.println("11. Rechazar solicitud de compra");
            System.out.println("12. Calcular total de una solicitud");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();
                    gp.agregarProveedor(new Proveedor(id, nombre, empresa));
                    System.out.println("Proveedor registrado.");
                    break;

                case 2:
                    System.out.print("Nombre del producto: ");
                    String prodNombre = sc.nextLine();
                    System.out.print("Precio unitario: ");
                    double precio = sc.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    gprod.agregarProducto(new Producto(prodNombre, precio, cantidad));
                    System.out.println("Producto registrado.");
                    break;

                case 3:
                    SolicitudCompra solicitud = new SolicitudCompra();
                    String agregarOtro;
                    do {
                        System.out.print("Nombre del producto a agregar: ");
                        String buscar = sc.nextLine();
                        Producto p = gprod.buscarPorNombre(buscar);
                        if (p != null) {
                            System.out.print("Cantidad que desea solicitar: ");
                            int canti = Integer.parseInt(sc.nextLine());
                            ItemSolicitud item = new ItemSolicitud(p, canti);
                            solicitud.agregarItem(item);
                            System.out.println("Producto agregado a la solicitud.");
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        System.out.print("¿Agregar otro producto? (s/n): ");
                        agregarOtro = sc.nextLine();
                    } while (agregarOtro.equalsIgnoreCase("s"));
                    gs.agregarSolicitud(solicitud);
                    System.out.println("Solicitud registrada con número: " + solicitud.getNumero());
                    break;
                case 4:
                    for (Proveedor prov : gp.listarProveedores()) {
                        prov.mostrarInformacion();
                    }
                    break;

                case 5:
                    for (Producto pr : gprod.listarProductos()) {
                        System.out.println(pr);
                    }
                    break;

                case 6:
                    for (SolicitudCompra s : gs.listarSolicitudes()) {
                        System.out.println(s);
                    }
                    break;

                case 7:
                    System.out.print("Ingrese ID del proveedor: ");
                    String buscarId = sc.nextLine();
                    Proveedor encontrado = gp.buscarPorId(buscarId);
                    if (encontrado != null) {
                        encontrado.mostrarInformacion();
                    } else {
                        System.out.println("Proveedor no encontrado.");
                    }
                    break;

                case 8:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombreProd = sc.nextLine();
                    Producto encontradoProd = gprod.buscarPorNombre(nombreProd);
                    if (encontradoProd != null) {
                        System.out.println(encontradoProd);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 9:
                    System.out.print("Ingrese número de solicitud: ");
                    int numSolicitud = sc.nextInt();
                    SolicitudCompra sol = gs.buscarPorNumero(numSolicitud);
                    if (sol != null) {
                        System.out.println(sol);
                    } else {
                        System.out.println("Solicitud no encontrada.");
                    }
                    break;

                case 10:
                    System.out.print("Ingrese número de solicitud a aprobar: ");
                    int numAprobar = sc.nextInt();
                    if (gs.aprobarSolicitud(numAprobar)) {
                        System.out.println("Solicitud aprobada.");
                    } else {
                        System.out.println("No se pudo aprobar (verifique el estado o número).");
                    }
                    break;

                case 11:
                    System.out.print("Ingrese número de solicitud a rechazar: ");
                    int numRechazar = sc.nextInt();
                    if (gs.rechazarSolicitud(numRechazar)) {
                        System.out.println("Solicitud rechazada.");
                    } else {
                        System.out.println("No se pudo rechazar (verifique el estado o número).");
                    }
                    break;

                case 12:
                    System.out.print("Ingrese número de solicitud: ");
                    int numCalcular = sc.nextInt();
                    SolicitudCompra s = gs.buscarPorNumero(numCalcular);
                    if (s != null) {
                        System.out.println("Total: $" + s.calcularTotal());
                    } else {
                        System.out.println("Solicitud no encontrada.");
                    }
                    break;

                case 13:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 13);

        sc.close();
    }
}