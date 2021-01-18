package com.quelp.quelpbackend.Repo;

import com.quelp.quelpbackend.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called answerRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface AnswerRepo  extends JpaRepository<Answer, Long> {
//    @Query(value = "SELECT * FROM ANSWER", nativeQuery = true)
    List<Answer> findAll();

    List<Answer>findAnswersByQuestionId (@Param("id") Long id);

    Answer findAnswerByQuestionId(@Param("id") Long id);

    Optional<Answer> findById(@Param("id")Long id);

    @Modifying
    @Query(value = "insert into ANSWER (id,answer,questionId) VALUES (:id,:answer,:questionId)", nativeQuery = true)
    @Transactional
    void addAnswer(@Param("id") Long id, @Param("answer") String answer, @Param("questionId") Long questionId);
}
