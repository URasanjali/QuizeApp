package com.newquizeapp.demo.controller;
import com.newquizeapp.demo.Question;
import com.newquizeapp.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    //hdhfd
    public List<Question> getAllQuestions(){

        return  questionService.getAllQuestions();
    }
}
