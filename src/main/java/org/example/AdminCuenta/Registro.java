package org.example.AdminCuenta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Registro {

    public void registrarCliente(Cliente cliente) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("src/main/java/org.example/Json/clientes.json")) {
            gson.toJson(cliente, writer);
            System.out.println("✅ Cliente registrado correctamente");
        } catch (IOException e) {
            System.out.println("❌ Error al registrar: " + e.getMessage());
        }
    }
}
