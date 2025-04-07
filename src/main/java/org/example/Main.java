package org.example;

import java.util.Arrays;

import org.example.AdminCuenta.Cliente;
import org.example.AdminCuenta.Registro;
import org.example.AdminCuenta.Login;
import org.example.Dispositivos.Dispositivo;
import org.example.Dispositivos.Notebook;
import org.example.Dispositivos.PC;
import org.example.Dispositivos.Pantalla;
import org.example.Dispositivos.Tablet;
import org.example.Tienda.Tienda;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Pérez", "juanperez@mail.com", "123456789", "Soltero", "Buenos Aires", "password123");
        new Registro().registrarCliente(new Cliente("Juan", "Pérez", "juanperez@mail.com", "123456789", "Soltero", "Buenos Aires", "password123"));
        new Login().iniciarSesion();

        Pantalla pantalla1 = new Pantalla("Samsung", "UHD", 2023);
        PC pc1 = new PC("Dell", "XPS 9000", 2024, 16, 512, "Intel i9", 1500.0, 10, "NVIDIA RTX 3080", "750W", "Torre", pantalla1);
        Notebook notebook1 = new Notebook("HP", "Spectre x360", 2023, 8, 256, "Intel i7", 1200.0, 15, "1920x1080", "Retroiluminado", 5000);
        Tablet tablet1 = new Tablet("Apple", "iPad Pro", 2024, 8, 256, "Apple M1", 999.0, 20, "2732x2048", Arrays.asList("Lápiz", "Funda"));

        Tienda tienda = new Tienda("Av. Libertador 1000, Buenos Aires");
        tienda.agregarDispositivo(pc1);
        tienda.agregarDispositivo(notebook1);
        tienda.agregarDispositivo(tablet1);

        System.out.println("Dispositivos disponibles en la tienda:");
        for (Dispositivo dispositivo : tienda.buscarPorMarca("HP")) {
            System.out.println(dispositivo);
        }

        if (tienda.realizarVenta(cliente1, notebook1)) {
            System.out.println("Venta realizada con éxito!");
        } else {
            System.out.println("No se pudo realizar la venta.");
        }

        System.out.println("Dispositivos disponibles después de la venta:");
        for (Dispositivo dispositivo : tienda.buscarPorMarca("HP")) {
            System.out.println(dispositivo);
        }

        tienda.mostrarVentas();
    }
}