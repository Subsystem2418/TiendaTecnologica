package org.example.Tienda;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.example.AdminCuenta.Cliente;
import org.example.Dispositivos.Dispositivo;

import com.google.gson.Gson;

public class Venta {
    private Cliente cliente;
    private Dispositivo dispositivo;
    private String fecha;

    public Venta(Cliente cliente, Dispositivo dispositivo) {
        this.cliente = cliente;
        this.dispositivo = dispositivo;
        this.fecha = java.time.LocalDate.now().toString();
    }

    public static void guardarVentaEnJson(Venta venta) {
        Gson gson = new Gson();
        String ruta = "src/main/java/org/example/Json/ventas.json";
    
        try (FileWriter writer = new FileWriter(ruta, true)) {
            String json = gson.toJson(venta);
            writer.write(json + System.lineSeparator());
            System.out.println("Venta guardada correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar la venta: " + e.getMessage());
        }
    }

    public static List<Venta> leerVentas(String ruta) {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(ruta)) {
            Venta[] ventasArray = gson.fromJson(reader, Venta[].class);
            if (ventasArray != null) {
                return new ArrayList<>(List.of(ventasArray));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo, creando uno nuevo.");
        } catch (IOException e) {
            System.out.println("Error al leer las ventas: " + e.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return "Venta [Cliente: " + cliente.getNombre() + ", Dispositivo: " + dispositivo.getModelo() + ", Fecha: " + fecha + "]";
    }
}
