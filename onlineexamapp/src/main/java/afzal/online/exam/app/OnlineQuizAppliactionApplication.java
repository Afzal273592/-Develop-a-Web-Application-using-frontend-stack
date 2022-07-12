package afzal.online.exam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineQuizAppliactionApplication  {
	

	
	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizAppliactionApplication.class, args);
	}

//	@Autowired
//	private UserService userService;
//	@Override
//	public void run(String... args) throws Exception {
//		 TODO Auto-generated method stub
//			System.out.println("Startifng Code");	
//		   	User user = new User();		
//		   	user.setFirstname("Muhammad");
//		   	user.setLastname("Afzal");
//		    user.setUsername("Afzal123");
//			user.setPassword("ABC");
//			user.setPhone("7");
//			user.setEmail("Asafdgh@gmail.com");
//			user.setProfile("Default.jpg");		
//			Role role = new Role();	
//			Autowired incerement
//			role.setRoleId(45L);
//			role.setRoleName("Admin");
//			UserRole userRole = new UserRole();
//			userRole.setRole(role);
//			userRole.setUser(user);
//			Set<UserRole> userRoleSet = new HashSet<>();
//			userRoleSet.add(userRole);
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1);
//	}

}
