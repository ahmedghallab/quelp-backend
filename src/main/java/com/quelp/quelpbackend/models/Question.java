package com.quelp.quelpbackend.models;


import lombok.*;

import javax.persistence.Entity;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {
    private String id;
    private String question;
    private String description;
    private int likes;
    private int dislikes;

    public void setId(String id) {
        this.id = id;
    }

    @javax.persistence.Id
    public String getId() {
        return id;
    }

}
