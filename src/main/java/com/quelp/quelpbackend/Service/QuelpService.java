package com.quelp.quelpbackend.Service;

import com.quelp.quelpbackend.Repo.AnswerRepo;
import com.quelp.quelpbackend.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuelpService {
    @Autowired
    AnswerRepo answerRepo;

    @Autowired
    QuestionRepo questionRepo;

}
