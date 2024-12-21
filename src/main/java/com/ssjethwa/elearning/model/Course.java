package com.ssjethwa.elearning.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double price;
    private String category;
    private int duration; // duration in hours

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private ELearnUser instructor;
}
