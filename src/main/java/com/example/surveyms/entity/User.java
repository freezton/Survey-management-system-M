package com.example.surveyms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String passwordHash;

    private String name;

    private String surname;

    @OneToMany(mappedBy = "creator", fetch = FetchType.EAGER)
    private List<Survey> surveys;

    public User() {
    }

    public User(String email, String passwordHash, String name, String surname) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.name = name;
        this.surname = surname;
    }

}
