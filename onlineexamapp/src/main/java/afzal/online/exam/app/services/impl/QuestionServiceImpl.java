package afzal.online.exam.app.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afzal.online.exam.app.models.exam.Question;
import afzal.online.exam.app.models.exam.Quiz;
import afzal.online.exam.app.repository.QuestionRespository;
import afzal.online.exam.app.services.QuestionService;

@Service
public class QuestionServiceImpl implements	QuestionService{
	
	@Autowired
	private QuestionRespository questionRespository;

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRespository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRespository.save(question);
	}

	@Override
	public Set<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(this.questionRespository.findAll());
	}

	@Override
	public Question getQuestionById(Long questionId) {
		// TODO Auto-generated method stub
		return this.questionRespository.findById(questionId).get();
	}

	@Override
	public void deleteQuestionById(Long questionId) {
		// TODO Auto-generated method stub
		Question question = new Question();
		question.setQuesId(questionId);
		
		this.questionRespository.delete(question);
	}

	@Override
	public Set<Question> getQuestionofQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.questionRespository.findByQuiz(quiz);
	}

	


}

