package org.eduardocd.model;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Libro implements Imprimible{
    private String author;
    private String title;
    private Category category;

    private List<Imprimible> pages;

    public Libro(String author, String title, Category category) {
        this.author = author;
        this.title = title;
        this.category = category;
        this.pages = new ArrayList<>();
    }

    public Libro addPage(Imprimible paper) {
        this.pages.add(paper);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author: ").append(this.author).append("\n")
                .append("Category: ").append(this.category).append("\n");
        for(Imprimible page : this.pages) {
            sb.append(page.imprimir()).append("\n");
        }
        return sb.toString();
    }

}
