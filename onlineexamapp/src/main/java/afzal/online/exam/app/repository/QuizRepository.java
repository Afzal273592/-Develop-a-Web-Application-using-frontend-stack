package afzal.online.exam.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import afzal.online.exam.app.models.exam.Category;
import afzal.online.exam.app.models.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

	public List<Quiz> findBycategory(Category category);
	
}
