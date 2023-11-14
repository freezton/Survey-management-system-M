package com.example.surveyms.repository;

import com.example.surveyms.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findById(long id);

    Optional<User> findByEmail(String email);
}
