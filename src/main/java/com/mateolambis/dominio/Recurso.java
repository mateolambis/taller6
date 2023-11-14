package com.mateolambis.dominio;

public abstract  class Recurso {
    private String titulo;
    private boolean prestado;

    public Recurso(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (this instanceof Prestable) {
            this.prestado = true;
            System.out.println("Recurso prestado: " + titulo);
        } else {
            System.out.println("Este recurso no es prestable.");
        }
    }

    public void devolver() {
        this.prestado = false;
        System.out.println("Recurso devuelto: " + titulo);
    }

    @Override
    public String toString() {
        return "Recurso: " + titulo + ", Prestado: " + prestado;
    }
}

