package com.quelp.quelpbackend.Rest;

import com.quelp.quelpbackend.models.Question;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/questionId")
    public Question getQuestionById() {
        Question q = new Question();
        q.setQuestion("Hello World");
        return q;
    }

}
