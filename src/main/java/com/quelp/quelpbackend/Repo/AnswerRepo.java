package com.quelp.quelpbackend.Repo;

import com.quelp.quelpbackend.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called answerRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface AnswerRepo  extends JpaRepository<Answer, Long> {
}
