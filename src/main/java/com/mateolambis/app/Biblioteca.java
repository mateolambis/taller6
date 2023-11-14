package com.mateolambis.app;

import com.mateolambis.dominio.Libro;
import com.mateolambis.dominio.Revista;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Mystery method");
        Libro libro2 = new Libro("Cien años de soledad");
        Revista revista1 = new Revista("El espectador");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(revista1);

        libro1.prestar();
        libro2.prestar();
        revista1.prestar();

        libro1.devolver();
        libro2.devolver();
        revista1.devolver();
    }
}
