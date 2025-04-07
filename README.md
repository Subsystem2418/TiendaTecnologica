
# Tienda Tecnológica

Está el deseo de crear un sistema simple para una tienda de venta de productos tecnologicos, como: Computador de Escritorio, Notebook y Tablets. Considerando eso, el repositorio presentado.


## Clases
**AdminCuenta**
- Cliente
- Login
- Registro

**Tienda**
- Venta
- Tienda

**Dispositivos**
- Notebook
- Dispositivo
- PC
- Pantalla
- Tablet

## Funcionalidades
- Registra un cliente en el sistema.
- Crea automáticamente el archivo JSON si no existe.
- Verifica que no se registren clientes duplicados (según email).
- Valida el correo y contraseña del cliente contra los datos registrados en el archivo JSON.
- Permite cambiar la dirección de la tienda.
- Agrega dispositivos tecnológicos (Notebook, PC, Tablet) al catálogo de la tienda.
---
Busqueda de dispositivos:
- Por marca
- Por modelo
- Por tipo (Notebook, PC, Tablet)
---
- Contiene atributos comunes: marca, modelo, año, RAM, almacenamiento, procesador, precio, stock.
- Método especificaciones() para obtener detalles.
- Asocia cliente + dispositivo vendido.
- Descuenta automáticamente el stock del dispositivo vendido.
- Guarda la venta en un archivo JSON (ventas.json), creando el archivo si no existe.
- Lee y muestra todas las ventas realizadas desde el archivo JSON.
## Evidencias y UML

![1](https://github.com/user-attachments/assets/05015eeb-1c39-40af-81ad-23db79faeebb)
![2](https://github.com/user-attachments/assets/128f7809-d6e9-4e50-948d-97eb7759e3ba)
![uml](https://github.com/user-attachments/assets/e51975db-0c7f-4029-89ff-6aff16ac3f90)

## Autores

- [Benjamín Valenzuela](https://www.github.com/06-Benjamin-V)
- [Erick Soto](https://www.github.com/Subsystem2418)

