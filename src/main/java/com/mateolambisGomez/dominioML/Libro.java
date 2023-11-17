package com.mateolambisGomez.dominioML;

public class Libro extends Recurso implements Prestable {
    public Libro(String titulo) {
        super(titulo);
    }

    @Override
    public String toString() {
        return "Libro";
    }
}