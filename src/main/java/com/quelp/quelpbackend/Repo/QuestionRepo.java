package com.quelp.quelpbackend.Repo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called questionRepository
// CRUD refers Create, Read, Update, Delete
// JpaRepo implements paging and sorting which implements Crud

import com.quelp.quelpbackend.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface QuestionRepo extends JpaRepository<Question, Long> {
    @Modifying
    @Query(value = "insert into QUESTION (id,question,description) VALUES (:id,:question,:description)", nativeQuery = true)
    @Transactional
    void addQuestion(@Param("id") Long id, @Param("question") String question, @Param("description") String description);

    @Query(value = "SELECT * FROM QUESTION", nativeQuery = true)
    List<Question> findAll();

//    @Query(value = "SELECT question FROM QUESTIONS WHERE id=:id", nativeQuery = true)
    Optional<Question> findById(@Param("id") Long id);
}