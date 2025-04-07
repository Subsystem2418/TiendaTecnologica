package org.example.Tienda;
import java.util.List;

public class Tienda {
    private String direccion;
    private List<Dispositivo> catalogoDispositivos;

    public Tienda(String direccion, List<Dispositivo>cataloDispositivos){
        this.direccion = direccion;
        this.catalogoDispositivos = cataloDispositivos;
    }
}
