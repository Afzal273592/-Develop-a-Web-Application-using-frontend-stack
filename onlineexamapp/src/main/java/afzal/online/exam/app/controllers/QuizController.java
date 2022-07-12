package afzal.online.exam.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afzal.online.exam.app.models.exam.Category;
import afzal.online.exam.app.models.exam.Quiz;
import afzal.online.exam.app.services.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {
		
	@Autowired
	private QuizService quizService ;
	
	//Add Quiz
//	@PostMapping("/quiz")
//	public ResponseEntity<Quiz> addAquiz(@PathVariable Quiz quiz) {
//		return ResponseEntity.ok(this.quizService.addQuiz(quiz));
//	}
//	
	@PostMapping("/")
	public ResponseEntity<Quiz> addQuiz(@PathVariable Quiz quiz){
		
		return ResponseEntity.ok(this.quizService.addQuiz(quiz));
	}
	
	
	//Update Quiz
	@PostMapping("/updatequiz")
	public ResponseEntity<Quiz> updateQuiz(@PathVariable Quiz quiz) {
		return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
	}
	
	//Get All Quiz
	@GetMapping("/getAllQuiz")
	public ResponseEntity<?> getAllQuiz( ) {
		return ResponseEntity.ok(this.quizService.getAllQuizes());
	}
	
	//Get Quiz By Id
	@GetMapping("/{quizId}")
	public Quiz getQuizById(@PathVariable("quizId") Long quizId) {
		return this.quizService.getQuizById(quizId);
	}
	
	//Delete Quiz
	@DeleteMapping("/{quizId}")
	public void deleteQuiz(@PathVariable("quizId") Long quizId) {	
		Quiz quiz = new Quiz();
		quiz.setqId(quizId);	
		this.quizService.deleteQuizById(quizId);
	}
	
	
	@GetMapping("/category/{cid}")
	public List<Quiz> getQuizzesofCtergory(@PathVariable("cid") Long cid){
		
		Category category = new Category();
		category.setcId(cid);
		return (List<Quiz>) this.quizService.getQuizzesOfCategor(category);
		
		 
	}
	
	
	
	
}
