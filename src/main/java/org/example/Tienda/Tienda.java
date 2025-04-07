package org.example.Tienda;
import java.util.ArrayList;
import java.util.List;

import org.example.AdminCuenta.Cliente;
import org.example.Dispositivos.Dispositivo;

public class Tienda {
    private String direccion;
    private List<Dispositivo> catalogo;

    public Tienda(String direccion){
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
    }

    public void cambiarDireccion(String nuevaDireccion){
        this.direccion = nuevaDireccion;
        System.out.println("La nueva Direccion es: "+nuevaDireccion);
    }

    public void agregarDispositivo(Dispositivo dispositivo){
        catalogo.add(dispositivo);
        System.out.println("se agrego el dispositivo: "+dispositivo);
    }

    public boolean realizarVenta(Cliente cliente, Dispositivo dispositivo) {
        if (dispositivo.getStock() > 0) {

            Venta venta = new Venta(cliente, dispositivo);
            System.out.println("Venta realizada: " + venta);

            dispositivo.setStock(dispositivo.getStock() - 1);

            Venta.guardarVentaEnJson(venta, "src/main/java/org/example/Json");
            return true;
        } else {
            System.out.println("Error: El dispositivo " + dispositivo.getModelo() + " está agotado.");
            return false;
        }
    }

    public List<Dispositivo> buscarPorMarca(String marca) {
        List<Dispositivo> resultados = new ArrayList<>();
        for (Dispositivo dispositivo : catalogo) {
            if (dispositivo.getMarca().equalsIgnoreCase(marca)) {
                resultados.add(dispositivo);
            }
        }
        return resultados;
    }

    public List<Dispositivo> buscarPorModelo(String modelo) {
        List<Dispositivo> resultados = new ArrayList<>();
        for (Dispositivo dispositivo : catalogo) {
            if (dispositivo.getModelo().equalsIgnoreCase(modelo)) {
                resultados.add(dispositivo);
            }
        }
        return resultados;
    }

    public List<Dispositivo> buscarPorTipo(String tipo) {
        List<Dispositivo> resultados = new ArrayList<>();
        for (Dispositivo dispositivo : catalogo) {
            if (dispositivo.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                resultados.add(dispositivo);
            }
        }
        return resultados;
    }


    public void mostrarVentas() {
        List<Venta> ventas = Venta.leerVentas("ventas.json");
        if (ventas == null || ventas.isEmpty()) {
            System.out.println("No se han realizado ventas.");
        } else {
            for (Venta venta : ventas) {
                System.out.println(venta);
            }
        }
    }

}
