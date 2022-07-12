package afzal.online.exam.app.services.impl;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afzal.online.exam.app.models.User;
import afzal.online.exam.app.models.UserRole;
import afzal.online.exam.app.repository.RoleRepository;
import afzal.online.exam.app.repository.UserRepository;
import afzal.online.exam.app.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	// Creating User 
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User localUser = (User) this.userRepository.findByUsername(user.getUsername());
		
		if(localUser != null) {
			// if error through Exception
			throw new Exception("User already exist !! ");
		}else {
			
			// Create new User 
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			
			localUser = this.userRepository.save(user);
		}
		
		return localUser;
	}

	// Getting User By User Name 
	@Override
	public User getUser(String username) {
		
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
	}



	@Override
	public List<User> findAllUsers() throws Exception {
		List<User>	alluser	 = this.userRepository.findAll();
		return alluser;
	}

	
	


}
