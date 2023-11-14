package com.example.surveyms.repository;

import com.example.surveyms.entity.Question;
import com.example.surveyms.entity.Survey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends CrudRepository<Question, Long> {

    Optional<Question> findById(long id);

    List<Question> findBySurvey(Survey survey);

}
