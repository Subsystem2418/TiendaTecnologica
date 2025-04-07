package org.example.AdminCuenta;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public boolean iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Correo electrónico: ");
        String email = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        try (FileReader reader = new FileReader("src/main/java/org.example/Json/clientes.json")) {
            Gson gson = new Gson();
            Cliente cliente = gson.fromJson(reader, Cliente.class);

            if (cliente.getEmail().equals(email) &&
                    cliente.getContrasena().equals(contrasena)) {

                System.out.println("✅");
                return true;
            } else {
                System.out.println("❌ Correo o contraseña incorrectos.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
