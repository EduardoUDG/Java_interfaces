package org.eduardocd;

import org.eduardocd.model.*;

public class Main {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo(
                "John Doe",
                "Ingeniero de Sistemas",
                "Resumen laboral...")
                .addExperience("Java")
                .addExperience("Javascript")
                .addExperience("Angular")
                .addExperience("Spring boot");

        Libro book = new Libro(
                "Erich Gamma",
                "Patrones de diseño",
                Category.PROGRAMING);

        book.addPage(new Pagina("Patron singleton"))
                .addPage(new Pagina("Patron Observador"))
                .addPage(new Pagina("Patron Factory"))
                .addPage(new Pagina("Patron Compositor"));

        Informe informe = new Informe(
                "Martin Fwoler",
                "James",
                "Estudió sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(book);

        System.out.println("Imprimiendo atritubo static desde una interfaz");
        System.out.println(Imprimible.TEXTO);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println( imprimible.imprimir() );
    }

}