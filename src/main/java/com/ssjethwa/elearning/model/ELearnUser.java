package com.ssjethwa.elearning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class ELearnUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String username;
    private String email;
    private String password;
    private String role; // student, instructor, admin
}
