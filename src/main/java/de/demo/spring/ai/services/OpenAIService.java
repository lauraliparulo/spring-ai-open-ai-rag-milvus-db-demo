package de.demo.spring.ai.services;


import de.demo.spring.ai.model.Answer;
import de.demo.spring.ai.model.Question;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    Answer getAnswer(Question question);
}
