package org.eduardocd.model;

public interface Imprimible {

    final static String TEXTO = "THIS IS A TEXT DAFULT";
    default String imprimir() {
        return TEXTO;
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println( imprimible.imprimir() );
    }
}
