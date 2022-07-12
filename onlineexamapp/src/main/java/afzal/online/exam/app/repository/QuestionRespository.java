package afzal.online.exam.app.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import afzal.online.exam.app.models.exam.Question;
import afzal.online.exam.app.models.exam.Quiz;


public interface QuestionRespository  extends JpaRepository<Question, Long>{

	Set<Question> findByQuiz(Quiz quiz);

}
