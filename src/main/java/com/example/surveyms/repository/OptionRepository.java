package com.example.surveyms.repository;

import com.example.surveyms.entity.Option;
import com.example.surveyms.entity.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OptionRepository extends CrudRepository<Option, Long> {

    Optional<Option> findById(long id);

    List<Option> findByQuestion(Question question);
}
