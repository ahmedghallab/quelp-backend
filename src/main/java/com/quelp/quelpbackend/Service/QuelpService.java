package com.quelp.quelpbackend.Service;

import com.quelp.quelpbackend.Repo.AnswerRepo;
import com.quelp.quelpbackend.Repo.QuestionRepo;
import com.quelp.quelpbackend.models.Answer;
import com.quelp.quelpbackend.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuelpService {
    @Autowired
    AnswerRepo answerRepo;

    @Autowired
    QuestionRepo questionRepo;

    public Question getQuestionById (String id){
        return questionRepo.getOne(Long.getLong(id));
    }
    public Answer getAnswerById (String id){
        return answerRepo.getOne(Long.getLong(id));
    }

}
