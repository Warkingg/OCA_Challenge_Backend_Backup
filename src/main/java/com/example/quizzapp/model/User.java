package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String rePassword;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

}
