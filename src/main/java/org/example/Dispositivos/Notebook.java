package org.example.Dispositivos;

public class Notebook extends Dispositivo{
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook(String marca, String modelo, int anio, int ram, int almacenamiento, String procesador,
            double precio, int stock, String resolucionPantalla, String tipoTeclado, int bateria) {
        super(marca, modelo, anio, ram, almacenamiento, procesador, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    @Override
    public String especificaciones() {
        return "Notebook con pantalla " + resolucionPantalla + ", teclado " + tipoTeclado + ", batería: " + bateria + "mAh";
    }

    
}
