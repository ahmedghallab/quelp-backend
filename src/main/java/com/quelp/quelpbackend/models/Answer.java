package com.quelp.quelpbackend.models;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Answers")
@Table(name="answers")
public class Answer extends BaseEntity {
    @Id
    private UUID answerID;
    private String answer;
    @Type(type="string-array")
    @Column(
            name = "answer_reactions",
            columnDefinition = "text[]"
    )
    private String [] reactions;
    @Type(type="string-array")
    @Column(
            name = "answer_children",
            columnDefinition = "integer[]"
    )
    private UUID  []childrenReplies;
}
