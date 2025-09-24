package com.newquizeapp.demo;
import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question_title")
    @JsonProperty("questionTitle")
    private String questionTitle;

    @Column(name = "category")
    @JsonProperty("category")
    private String category;

    @Column(name = "option1")
    @JsonProperty("option1")
    private String option1;
    @Column(name = "option2")
    @JsonProperty("option2")
    private String option2;
    @Column(name = "option3")
    @JsonProperty("option3")
    private String option3;
    @Column(name = "option4")
    @JsonProperty("option4")
    private String option4;

    @Column(name = "right_answer")
    @JsonProperty("rightAnswer")
    private String rightAnswer;

    @Column(name = "difficulty_level")
    @JsonProperty("difficultyLevel")
    private String difficultyLevel;
}
