package de.demo.spring.ai.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.demo.spring.ai.model.Answer;
import de.demo.spring.ai.model.Question;
import de.demo.spring.ai.services.OpenAIService;

/**
 * Created by jt, Spring Framework Guru.
 */
@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    
    @PostMapping("/ask")
    //     "question": "what is a good boat to buy?"
    // "What is the best XMen Marvel movie to see?"
    // "question": "What is the best movie with Hugh Jackman?"
    // "has Tom Cruise been successful since 2012?"
    // "question": "has Harrison Ford been more successful than Tom Cruise since 2012?"
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

}
