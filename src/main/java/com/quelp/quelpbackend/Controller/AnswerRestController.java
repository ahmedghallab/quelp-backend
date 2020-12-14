package com.quelp.quelpbackend.Controller;

import com.quelp.quelpbackend.Service.AnswerService;
import com.quelp.quelpbackend.models.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@org.springframework.web.bind.annotation.RestController

//@RequestMapping(path="api/quelp")
public class AnswerRestController {
    private final AnswerService answerService;
    @Autowired
    public AnswerRestController( AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/answerId")
    public Answer getAnswerId(@Param("id") String id) {
        return answerService.getAnswerById(Long.valueOf(id));
    }

    @GetMapping("/answerByQuestionId")
    public Answer getAnswerByQuestionId(@Param("id") String id) {
        return answerService.findAnswerByQuestionId(Long.valueOf(id));
    }


    @GetMapping("/answers")
    public List<Answer> getAllQuestions(@Param("id") String id) {
        return answerService.findAnswersByQuestionId(Long.valueOf(id));
    }

    @PostMapping("/newAnswer")
    public void addAnswer(@RequestBody Answer question) {
        this.answerService.addAnswer(question);
    }

    @GetMapping("/all-answers")
    public List<Answer> getAnswers() {
        return answerService.getAll();
    }

}
