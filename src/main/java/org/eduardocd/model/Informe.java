package org.eduardocd.model;

public class Informe extends Hoja implements Imprimible{

    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String content) {
        super(content);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor
                + "Revisado por: " + this.revisor
                + "\n" + this.content;
    }

}