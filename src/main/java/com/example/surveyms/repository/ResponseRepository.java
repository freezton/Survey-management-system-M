package com.example.surveyms.repository;

import com.example.surveyms.entity.Response;
import com.example.surveyms.entity.Survey;
import com.example.surveyms.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ResponseRepository extends CrudRepository<Response, Long> {

    Optional<Response> findById(long id);

    List<Response> findByUser(User user);

    List<Response> findBySurvey(Survey survey);
}
