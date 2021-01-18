package com.quelp.quelpbackend.Service;

import com.quelp.quelpbackend.Repo.AnswerRepo;
import com.quelp.quelpbackend.Repo.QuestionRepo;
import com.quelp.quelpbackend.models.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    AnswerRepo answerRepo;
    QuestionRepo questionRepo;
    @Autowired
    public AnswerService(AnswerRepo answerRepo, QuestionRepo questionRepo)
    {
        this.questionRepo = questionRepo;
        this.answerRepo = answerRepo;
    }

    public Optional<Answer> getAnswerById(Long id) {
        return answerRepo.findById(id);
    }
    public List<Answer> getAll() {
        return answerRepo.findAll();
    }

    public void addAnswer(Answer answer) {
        long questionId = questionRepo.findById(answer.getQuestionId()).get().getId();
        answerRepo.addAnswer(answer.getId(),
                answer.getAnswer(), questionId);
    }

    public List<Answer> findAnswersByQuestionId(Long id) {
        return answerRepo.findAnswersByQuestionId(id);
    }

    public Answer findAnswerByQuestionId(Long id) {
        return answerRepo.findAnswerByQuestionId(id);
    }
}
