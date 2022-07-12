package afzal.online.exam.app.services;


import java.util.List;
import java.util.Set;
import afzal.online.exam.app.models.User;
import afzal.online.exam.app.models.UserRole;




public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	// Get User by User Name
	public User getUser(String username);
	
	//Delete use by UserName
	public void deleteUser(Long userId);
	
	
	//Get All Users

	public List<User> findAllUsers() throws Exception;
	
}
