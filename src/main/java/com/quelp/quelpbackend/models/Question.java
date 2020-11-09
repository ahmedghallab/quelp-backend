package com.quelp.quelpbackend.models;


import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Questions")
//@Table(name="questions")
public class Question extends BaseEntity  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long questionId;
    private String question;
    private String description;
//    @Type(type="string-array")
//    @Column(
//            name = "question_reactions",
//            columnDefinition = "text[]"
//    )
//    private String[] reactions;
//    @Type(type="string-array")
//    @Column(
//            name = "question_children",
//            columnDefinition = "integer[]"
//    )
//    private ArrayList<UUID> childrenAnswers;

}
