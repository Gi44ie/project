package com.javamentor.qa.platform.service.impl.model;

import com.javamentor.qa.platform.dao.abstracts.model.QuestionDao;
import com.javamentor.qa.platform.models.entity.question.Question;
import com.javamentor.qa.platform.service.abstracts.model.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionServiceImpl extends ReadWriteServiceImpl<Question, Long> implements QuestionService {

    private final QuestionDao questionDao;

    public QuestionServiceImpl(QuestionDao questionDao) {
        super(questionDao);
        this.questionDao = questionDao;
    }

    @Override
<<<<<<<<< Temporary merge branch 1
    public Long getCountByQuestion() {
        return questionDao.getCountQuestion();
=========
    public Optional<Question> getQuestionByIdWithAuthor(Long id){
        return questionDao.getQuestionByIdWithAuthor(id);
>>>>>>>>> Temporary merge branch 2
    }
}
