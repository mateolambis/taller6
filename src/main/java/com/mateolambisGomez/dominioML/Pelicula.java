package com.mateolambisGomez.dominioML;

public class Pelicula extends Recurso implements Prestable {
    public Pelicula(String titulo) {
        super(titulo);
    }

    @Override
    public String toString() {
        return "Pelicula";
    }
}