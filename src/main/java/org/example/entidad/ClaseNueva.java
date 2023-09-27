package org.example.entidad;

public class ClaseNueva {
    String nombre;

    public ClaseNueva(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ClaseNueva{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
