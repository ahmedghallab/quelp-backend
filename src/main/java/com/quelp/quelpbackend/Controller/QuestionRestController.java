package com.quelp.quelpbackend.Controller;

import com.quelp.quelpbackend.Service.QuestionService;
import com.quelp.quelpbackend.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@org.springframework.web.bind.annotation.RestController

//@RequestMapping(path="api/quelp")
public class QuestionRestController {
    private final QuestionService questionService;
    @Autowired
    public QuestionRestController(QuestionService service) {
        this.questionService = service;
    }

    @GetMapping("/questionId")
    public Question getQuestionById(@Param("id") String id) {
        return questionService.getQuestionById(id);
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/newQuestion")
    public void addQuestion(@RequestBody Question question) {
        this.questionService.addQuestion(question);
    }



}
