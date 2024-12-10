package gestion;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico() {
        this.zonas = new ArrayList<>();  // Inicializar la lista de zonas
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();  // Inicializar la lista de zonas
    }

    public void agregarZona(Zona zona) {
        this.zonas.add(zona);  // Añadir zona a la lista
    }

    public int cantidadTotalAnimales() {
        int totalAnimales = 0;

        // Iterar sobre la lista de zonas y sumar los animales
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }

        return totalAnimales;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}

