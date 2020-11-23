package com.quelp.quelpbackend.Repo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called questionRepository
// CRUD refers Create, Read, Update, Delete
// JpaRepo implements paging and sorting which implements Crud
import com.quelp.quelpbackend.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {

}