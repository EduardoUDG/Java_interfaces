package org.eduardocd.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract public class Hoja {

    protected String content;

    abstract public String imprimir();

}