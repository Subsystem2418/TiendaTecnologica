package org.example.AdminCuenta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Registro {

    private static final String FILE_PATH = "src/main/java/org/example/Json/clientes.json";

    public void registrarCliente(Cliente cliente) {
        crearArchivoSiNoExiste();
        List<Cliente> clientes = leerClientesDesdeArchivo();

        if (clientes != null && clientes.contains(cliente)) {
            System.out.println("El cliente ya está registrado.");
            return;
        }

        if (clientes == null) {
            clientes = new ArrayList<>();
        }
        clientes.add(cliente);

        guardarClientesEnArchivo(clientes);

        System.out.println("Cliente registrado correctamente");
    }

    private void crearArchivoSiNoExiste() {
        try {
            Files.createDirectories(Paths.get("src/main/java/org/example/Json"));

            if (!Files.exists(Paths.get(FILE_PATH))) {
                Files.createFile(Paths.get(FILE_PATH));
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    private List<Cliente> leerClientesDesdeArchivo() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type tipoListaClientes = new TypeToken<List<Cliente>>() {}.getType();
            return gson.fromJson(reader, tipoListaClientes);
        } catch (IOException e) {
            return null;
        }
    }

    private void guardarClientesEnArchivo(List<Cliente> clientes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(clientes, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
