package com.quelp.quelpbackend.Controller;

import com.quelp.quelpbackend.Service.QuelpService;
import com.quelp.quelpbackend.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;

@org.springframework.web.bind.annotation.RestController

//@RequestMapping(path="api/quelp")
public class RestController {

    private QuelpService service;

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
        Question q = new Question();
        q.setQuestion("Who asked this?");
        q.setDescription("Question description");
        entityManager.persist(q);
        return q;
    }

}
