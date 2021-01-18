package com.quelp.quelpbackend.Service;

import com.quelp.quelpbackend.Repo.QuestionRepo;
import com.quelp.quelpbackend.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    QuestionRepo questionRepo;

    @Autowired
    public QuestionService( QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public Optional<Question> getQuestionById (String id){
        return questionRepo.findById(Long.parseLong(id));
    }

    public void addQuestion (Question question){
        questionRepo.addQuestion(question.getId(), question.getQuestion(), question.getDescription());
    }
    public List<Question> getAllQuestions(){
        return questionRepo.findAll();
    }

}
