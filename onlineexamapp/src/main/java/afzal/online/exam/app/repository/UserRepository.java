package afzal.online.exam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import afzal.online.exam.app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);

	
	
}
