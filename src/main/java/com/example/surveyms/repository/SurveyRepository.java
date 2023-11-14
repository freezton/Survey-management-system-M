package com.example.surveyms.repository;


import com.example.surveyms.entity.Survey;
import com.example.surveyms.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SurveyRepository extends CrudRepository<Survey, Long> {

    Optional<Survey> findById(long id);

    List<Survey> findByCreator(User creator);
}
