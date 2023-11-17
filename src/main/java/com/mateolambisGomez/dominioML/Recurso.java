package com.mateolambisGomez.dominioML;

public abstract class Recurso {
    private String tituloMateo;
    private boolean prestadoMateo;

    public Recurso(String tituloMateo) {
        this.tituloMateo = tituloMateo;
        this.prestadoMateo = false;
    }

    public String getTituloMateo() {
        return tituloMateo;
    }

    public boolean isPrestadoMateo() {
        return prestadoMateo;
    }

    public void prestarLambis() {
        if (this instanceof Prestable) {
            if (!this.prestadoMateo) {
                this.prestadoMateo = true;
                System.out.println("Recurso prestado: " + tituloMateo);
            } else {
                System.out.println("Este recurso ya está prestado.");
            }
        } else {
            System.out.println("Este recurso no es prestable.");
        }
    }

    public void devolverLambis() {
        this.prestadoMateo = false;
        System.out.println("Recurso devuelto: " + tituloMateo);
    }

    @Override
    public String toString() {
        return "Recurso: " + tituloMateo + ", Prestado: " + prestadoMateo;
    }
}
