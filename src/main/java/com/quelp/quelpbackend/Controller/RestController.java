package com.quelp.quelpbackend.Controller;

import com.quelp.quelpbackend.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;

@org.springframework.web.bind.annotation.RestController

//@RequestMapping(path="api/quelp")
public class RestController {


    @Autowired
    private EntityManager entityManager;

    @GetMapping("/questionId")
    public Question getQuestionById() {
        Question q = new Question();
        q.setQuestion("Hello World");
        return q;
    }

    @GetMapping("/getQuestions")
    @Transactional
    public Question getQuestions() {
        Question q = Question.builder()
                .question("Who asked this?")
                .description("Question description")
                .id("4" + Math.random())
                .build();
//        Question q = new Question(Long.getLong(UUID.randomUUID().toString()),"qw","wq",1,2);
        entityManager.persist(q);
        return q;
    }

}
