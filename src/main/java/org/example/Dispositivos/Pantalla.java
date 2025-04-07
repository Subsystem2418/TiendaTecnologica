package org.example.Dispositivos;

public class Pantalla {
    private String marca;
    private String modelo;
    private int anio;
    public Pantalla(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Pantalla|| Marca: "+marca+", Modelo: "+modelo+", Año: "+anio;
    }
}
