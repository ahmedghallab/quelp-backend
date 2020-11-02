package com.quelp.quelpbackend.models;


import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Questions")
@Table(name="questions")
public class Question extends BaseEntity{
    @Id
    private UUID questionId;
    private String question;
    private String description;
    @Type(type="string-array")
    @Column(
            name = "question_reactions",
            columnDefinition = "text[]"
    )
    private String[] reactions;
    @Type(type="string-array")
    @Column(
            name = "question_children",
            columnDefinition = "integer[]"
    )
    private ArrayList<UUID> childrenAnswers;

}
