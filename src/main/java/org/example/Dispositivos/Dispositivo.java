package org.example.Dispositivos;

public abstract class Dispositivo{
    private String marca;
    private String modelo;
    private int anio;
    private int ram;
    private int almacenamiento;
    private String procesador;
    private double precio;
    private int stock;

    public Dispositivo(String marca, String modelo, int anio, int ram, int almacenamiento, String procesador, double precio, int stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public void descontarStock(int cantidad) { stock -= cantidad; }
    public int getStock() { return stock; }
    public abstract String especificaciones();

    @Override
    public String toString() {
        return marca + " " + modelo + " - $" + precio + " (" + stock + " en stock)";
    }
}
