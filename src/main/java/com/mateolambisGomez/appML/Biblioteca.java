package com.mateolambisGomez.appML;

import com.mateolambisGomez.dominioML.*;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libroLambis1 = new Libro("Mystery method");
        Libro libroLambis2 = new Libro("Cien años de soledad");
        Revista revista1 = new Revista("El espectador");
        Tesis tesis1 = new Tesis("Tesis sobre IA");
        AudioLibro audioLibro1 = new AudioLibro("Audiolibro de Ciencia Ficción");
        Pelicula pelicula1 = new Pelicula("Inception");

        System.out.println(libroLambis1);
        System.out.println(libroLambis2);
        System.out.println(revista1);
        System.out.println(tesis1);
        System.out.println(audioLibro1);
        System.out.println(pelicula1);

        libroLambis1.prestarLambis();
        libroLambis2.prestarLambis();
        revista1.prestarLambis();
        revista1.prestarLambis();
        tesis1.prestarLambis();
        audioLibro1.prestarLambis();
        pelicula1.prestarLambis();

        libroLambis1.devolverLambis();
        libroLambis2.devolverLambis();
        revista1.devolverLambis();
        tesis1.devolverLambis();
        audioLibro1.devolverLambis();
        pelicula1.devolverLambis();
    }
}