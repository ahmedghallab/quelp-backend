package com.quelp.quelpbackend.models;

import lombok.*;

import java.util.ArrayList;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
    UUID answerID;
    String answer;
    String [] reactions;
    ArrayList<UUID> childrenReplies;
}
