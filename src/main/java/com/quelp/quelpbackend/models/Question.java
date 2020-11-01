package com.quelp.quelpbackend.models;


import lombok.*;

import java.util.ArrayList;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    UUID questionId;
    String question;
    String description;
    String[] reactions;
    ArrayList<UUID> childrenAnswers;

}
