package org.example.Dispositivos;

public class PC extends Dispositivo{
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public PC(String marca, String modelo, int anio, int ram, int almacenamiento, String procesador, double precio,
            int stock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, modelo, anio, ram, almacenamiento, procesador, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    @Override
    public String especificaciones() {
        return "Escritorio con GPU: " + tarjetaVideo + ", PSU: " + fuentePoder + ", Chasis: " + chasis + ", Pantalla: " + pantalla.toString();
    }

    
}
