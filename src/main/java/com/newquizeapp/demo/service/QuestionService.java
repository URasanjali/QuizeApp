package com.newquizeapp.demo.service;

import com.newquizeapp.demo.Question;
import com.newquizeapp.demo.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        //questionDao.getAllQuestions();
        return questionDao.findAll();
    }
}
