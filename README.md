## Examen

## Autores:

1. Jose Avecillas
2. Joey Diaz

# Sistema de Gestión de Compras ERP (Java)

Este proyecto es una aplicación de consola en Java que simula un sistema básico ERP (Enterprise Resource Planning) enfocado en la gestión de **proveedores**, **productos** y **solicitudes de compra**.

## Estructura del Proyecto

El proyecto está dividido en tres capas principales:

- **Modelo (`modelo/`)**: Define las entidades del sistema, como productos, proveedores y solicitudes.
- **Servicio (`servicio/`)**: Contiene las clases que gestionan el almacenamiento y manipulación de objetos (gestores).
- **Interfaz (`App.java`)**: Implementa una interfaz de consola para interactuar con el usuario mediante un menú.

## Funcionalidades Principales

- Registrar proveedores y productos.
- Crear solicitudes de compra con múltiples productos.
- Listar proveedores, productos y solicitudes.
- Buscar proveedores por ID, productos por nombre y solicitudes por número.
- Aprobar o rechazar solicitudes de compra.
- Calcular el total de una solicitud basada en los productos solicitados.

## Cómo ejecutar el proyecto

1. Clona el repositorio o copia el código en tu entorno local.
2. Abre el proyecto en tu IDE de preferencia (Eclipse, IntelliJ, NetBeans o VS Code con soporte Java).
3. Ejecuta la clase `App.java` para comenzar a utilizar el sistema por consola.

## Requisitos

- Java JDK 8 o superior.
- IDE para desarrollo Java o terminal con compilador (`javac` y `java`).

## Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Uso de `ArrayList` y estructuras de datos
- Interfaces (`Calculable`)
- Enumeraciones (`EstadoSolicitud`)
- Encapsulamiento y buenas prácticas de diseño por capas

## Ideas futuras

- Persistencia de datos (archivos o base de datos)
- Interfaz gráfica con JavaFX o Swing
- Reportes en PDF o CSV

## Ejemplo de Salida:
```
===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra 
7. Buscar proveedor por ID      
8. Buscar producto por nombre   
9. Buscar solicitud por número  
10. Aprobar solicitud de compra 
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 1
ID: 010
Nombre: Joey Diaz
Empresa: UPS
Proveedor registrado.

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 2
Nombre del producto: manzana
Precio unitario: 1
Cantidad: 10
Producto registrado.

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 4
Proveedor: Joey Diaz | Empresa: UPS

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 5
manzana - 10 unidades - $10.0

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 3
Nombre del producto a agregar: manzana
Cantidad que desea solicitar: 3
Producto agregado a la solicitud.
¿Agregar otro producto? (s/n): n
Solicitud registrada con número: 1

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 6
Solicitud #1 - Estado: SOLICITADA - Total: $3.0

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 7
Ingrese ID del proveedor: 010
Proveedor: Joey Diaz | Empresa: UPS

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 7
Ingrese ID del proveedor: 100
Proveedor no encontrado.

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 8
Ingrese nombre del producto: manzana
manzana - 10 unidades - $10.0

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 8
Ingrese nombre del producto: guineo
Producto no encontrado.

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 9
Ingrese número de solicitud: 1
Solicitud #1 - Estado: SOLICITADA - Total: $3.0

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 9
Ingrese número de solicitud: 2
Solicitud no encontrada.

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 10
Ingrese número de solicitud a aprobar: 1
Solicitud aprobada.

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 11
Ingrese número de solicitud a rechazar: 1
No se pudo rechazar (verifique el estado o número).

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 12
Ingrese número de solicitud: 1
Total: $3.0

===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====
1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
10. Aprobar solicitud de compra
11. Rechazar solicitud de compra
12. Calcular total de una solicitud
13. Salir
Seleccione una opción: 13
Saliendo del sistema...

```