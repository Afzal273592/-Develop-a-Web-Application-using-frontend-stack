package afzal.online.exam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import afzal.online.exam.app.models.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
