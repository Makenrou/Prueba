package com.example.prueba;

public class Prueba {
    private String nombre;
    private int edad;

    public Prueba() {
    }

    public Prueba(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}