package com.quelp.quelpbackend.Repo;

import com.quelp.quelpbackend.models.Answer;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface AnswerRepo  extends CrudRepository<Answer, Long> {
}
