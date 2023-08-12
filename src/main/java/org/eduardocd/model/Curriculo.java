package org.eduardocd.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private String person;
    private String career;
    private List<String> experiences;


    public Curriculo(String person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }

    public Curriculo addExperience( String newExperience ) {
        this.experiences.add(newExperience);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append(this.person).append("\n")
                .append("Resumen: ").append(this.content)
                .append("\n").append("Profession: ")
                .append(this.career).append("\n")
                .append("Experience: ").append("\n");
        for(String exp : this.experiences ) {
            sb.append("- ")
                    .append(exp)
                    .append("\n");
        }
        return sb.toString();
    }

}