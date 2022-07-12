package afzal.online.exam.app.services;

import java.util.Set;

import afzal.online.exam.app.models.exam.Question;
import afzal.online.exam.app.models.exam.Quiz;


public interface QuestionService {
	
	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public Set<Question> getAllQuestions();
	public Question getQuestionById(Long questionId);
	public void deleteQuestionById(Long questionId);
	public Set<Question> getQuestionofQuiz(Quiz quiz);
}
