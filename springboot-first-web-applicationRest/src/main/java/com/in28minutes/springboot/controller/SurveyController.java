package com.in28minutes.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.springboot.model.Question;
import com.in28minutes.springboot.model.Survey;
import com.in28minutes.springboot.service.SurveyService;

@RestController
public class SurveyController {

	@Autowired
	SurveyService service;

	@GetMapping("/surveys/{surveyId}/questions")

	public List<Question> retrieveQuestionsforSurvey(@PathVariable String surveyId) {
		return service.retrieveQuestions(surveyId);
	}

	@GetMapping("/surveys/{surveyId}/questions/{questionId}")

	public Question retrieveDetailsforQestion(@PathVariable String surveyId, @PathVariable String questionId) {
		return service.retrieveQuestion(surveyId, questionId);
	}
	@PostMapping("/surveys/{surveyId}/questions")
	public ResponseEntity<Object> addQuestion(@PathVariable String surveyId,@RequestBody Question question) {
		
		
		
		Question createdTodo=service.addQuestion(surveyId, question);
		if (createdTodo == null) {
            return ResponseEntity.noContent().build();
        }
		
		System.out.println("QuestionId>>>>>>>>>>>>>"+createdTodo.getId());
		System.out.println("currentRequest>>>>>>>>>>>>>>>>>>>>"+ServletUriComponentsBuilder.fromCurrentRequest());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		
		System.out.println("location>>>>>>>>>>>>>"+location);
		
		

        return ResponseEntity.created(location).build();

	

	}

	@GetMapping("/surveys/{surveyId}")
	public Survey retrieveSurveyDetails(@PathVariable String surveyId) {
		return service.retrieveSurvey(surveyId);
	}
	
	@GetMapping("/surveys")
	public Survey retrieveSurveyDetailsforJquery() {
		return service.retrieveSurvey("Survey1");
	}

}
