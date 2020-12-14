package com.quelp.quelpbackend.Service;

import com.quelp.quelpbackend.Repo.AnswerRepo;
import com.quelp.quelpbackend.models.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    AnswerRepo answerRepo;

    @Autowired
    public AnswerService(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }

    public Answer getAnswerById(Long id) {
        return answerRepo.getOne(id);
    }
    public List<Answer> getAll() {
        return answerRepo.findAll();
    }

    public void addAnswer(Answer answer) {
        answerRepo.addAnswer(answer.getId(),
                answer.getAnswer(), answer.getQuestionId());
    }

    public List<Answer> findAnswersByQuestionId(Long id) {
        return answerRepo.findAnswersByQuestionId(id);
    }

    public Answer findAnswerByQuestionId(Long id) {
        return answerRepo.findAnswerByQuestionId(id);
    }
}
