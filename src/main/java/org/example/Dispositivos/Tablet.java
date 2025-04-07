package org.example.Dispositivos;
import java.util.List;

public class Tablet extends Dispositivo{
    private String resolucionPantalla;
    private List<String> accesorios;

    public Tablet(String marca, String modelo, int anio, int ram, int almacenamiento, String procesador, double precio,
            int stock, String resolucionPantalla, List<String> accesorios) {
        super(marca, modelo, anio, ram, almacenamiento, procesador, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = accesorios;
    }

    @Override
    public String especificaciones() {
        return "Tablet con resolución " + resolucionPantalla + ", accesorios: " + accesorios.toString();
    }

    
}
