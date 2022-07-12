package afzal.online.exam.app.controllers;

import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afzal.online.exam.app.models.Role;
import afzal.online.exam.app.models.User;
import afzal.online.exam.app.models.UserRole;
import afzal.online.exam.app.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
//	Create User 
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		user.setProfile("default.jpg");		
		Role role = new Role();		
		role.setRoleName("Normal User");
		user.setUsertype("normal");
		
		UserRole userRole = new UserRole();
		
		userRole.setRole(role);
		userRole.setUser(user);
		
		Set<UserRole> roles = new HashSet<>(); 
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
	}
	
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		
		return this.userService.getUser(username);
	}
	
	

	
	@DeleteMapping("/{userid}")
	public void deletUser(@PathVariable("userid") Long userid) {
		
		 this.userService.deleteUser(userid);
	}
	
	
	@GetMapping("/findAllUser")
	public List<User> findAllUsers() throws Exception {
		
		 List<User> findAllUsers = this.userService.findAllUsers();
//		 findAllUsers.stream().filter(e -> {
//			 System.err.println(e);
//		 });
		
		 return findAllUsers;
 
	}
	
	
	@GetMapping("/current-user")
	public User getCurrentUser(@PathVariable  Principal principal) {
		
		return (User) this.userService.getUser(principal.getName());
	}
	
//	@ExceptionHandler(UserPrincipalNotFoundException.class)
//	public ResponseEntity<?> exceptionHandler(UserPrincipalNotFoundException ex){
//		return ResponseEntity<>
//		
//	}
}
