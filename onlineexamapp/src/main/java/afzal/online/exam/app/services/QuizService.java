package afzal.online.exam.app.services;

import java.util.List;
import java.util.Set;


import afzal.online.exam.app.models.exam.Category;
import afzal.online.exam.app.models.exam.Quiz;


public interface QuizService {
	
	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz> getAllQuizes();
	public Quiz getQuizById(Long quizId);
	public void deleteQuizById(Long quizId);

	public List<Quiz> getQuizzesOfCategor(Category category);
	
	
	
	
	
}
