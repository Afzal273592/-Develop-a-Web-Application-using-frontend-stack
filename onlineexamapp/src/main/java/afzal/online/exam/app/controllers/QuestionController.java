package afzal.online.exam.app.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afzal.online.exam.app.models.exam.Question;
import afzal.online.exam.app.models.exam.Quiz;
import afzal.online.exam.app.services.QuestionService;
import afzal.online.exam.app.services.QuizService;


@RestController
@RequestMapping("/question")
@CrossOrigin("*")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	//Add Question
	@PostMapping("/")
	public ResponseEntity<Question> addQuestion(@PathVariable Question question) {
		return ResponseEntity.ok(this.questionService.addQuestion(question));
	}
	
	//update Question
	@PutMapping("/updateQuestion")
	private Question updateQuestion(@PathVariable Question question) {
		return this.questionService.updateQuestion(question);
	}
	
	//Get All Question
	@GetMapping("/getAllQuestion")
	public ResponseEntity<?> getAllQuestion(){
		return ResponseEntity.ok(this.questionService.getAllQuestions());
	}
	
	//Get Single Question
	@GetMapping("/{questionId}")
	public Question getQuestionById(@PathVariable("questionId") Long questionId) {
		return this.questionService.getQuestionById(questionId);
	}
	
	
	// Delete Question
	@DeleteMapping("/{questionId}")
	private void deleteQuestion(@PathVariable("questionId") Long questionId)
	{	
		this.questionService.deleteQuestionById(questionId);		
	}
	
	@Autowired
	private QuizService quizService;
	
	// Get All Question of Any kind
	@GetMapping("/quiz/{qid}")
	public ResponseEntity<?> getQuestionsofQuiz(@PathVariable("qid") Long qid){	

		Quiz quiz = this.quizService.getQuizById(qid);	
		Set<Question> questions = quiz.getQuestions();			
		ArrayList<Question> list = new ArrayList<Question>(questions);
		
		if(list.size()> Integer.parseInt(quiz.getNumberOfQuestions()))
		{
			list = (ArrayList<Question>) list.subList(0, Integer.parseInt(quiz.getNumberOfQuestions()+1));
		}
		Collections.shuffle(list);
		return ResponseEntity.ok(list);
		
		
	}
}
