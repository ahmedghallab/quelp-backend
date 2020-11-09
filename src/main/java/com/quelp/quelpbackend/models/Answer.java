package com.quelp.quelpbackend.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Answers")
//@Table(name="answers")
public class Answer extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long answerID;
    private String answer;
//    @Type(type="string-array")
//    @Column(
//            name = "answer_reactions",
//            columnDefinition = "text[]"
//    )
//    private String [] reactions;
//    @Type(type="string-array")
//    @Column(
//            name = "answer_children",
//            columnDefinition = "integer[]"
//    )
//    private UUID  []childrenReplies;
}
