package afzal.online.exam.app.services.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afzal.online.exam.app.models.exam.Category;
import afzal.online.exam.app.models.exam.Quiz;
import afzal.online.exam.app.repository.QuizRepository;
import afzal.online.exam.app.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepository quizRespository;
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		return this.quizRespository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRespository.save(quiz);
	}

	@Override
	public Set<Quiz> getAllQuizes() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(this.quizRespository.findAll());
	}

	@Override
	public Quiz getQuizById(Long quizId) {
		// TODO Auto-generated method stub
		return this.quizRespository.findById(quizId).get();
	}

	@Override
	public void deleteQuizById(Long quizId) {
		// TODO Auto-generated method stub

		this.quizRespository.deleteById(quizId);
	}

	@Override
	public List<Quiz> getQuizzesOfCategor(Category category) {
		// TODO Auto-generated method stub
		return this.quizRespository.findBycategory(category);
	}

}
