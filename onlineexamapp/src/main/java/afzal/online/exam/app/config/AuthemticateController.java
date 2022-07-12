//package afzal.online.exam.app.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import afzal.online.exam.app.models.JwtRequest;
//import afzal.online.exam.app.models.JwtResponse;
//import afzal.online.exam.app.services.impl.UserDetailServiceImpl;
//
//@RestController
//public class AuthemticateController {
//	
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private UserDetailServiceImpl userDetailService;
//	
//	@Autowired
//	private jwtUtil jwtutils;
//	
//	
//	@PostMapping("/generate-token")
//	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
//		
//		try {
//			
//			authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
//		} catch (UsernameNotFoundException e) {
//			
//			e.printStackTrace();
//			throw new Exception("User not found");
//			
//		}
//		
//		UserDetails userDetails = this.userDetailService.loadUserByUsername(jwtRequest.getUsername());
//		
//		String token = this.jwtutils.generateToken(userDetails);
//		
//		return ResponseEntity.ok(new JwtResponse(token));
//	}
//	
//	private void authenticate(String username, String password) throws Exception 
//	{
//	
//		try {
//			
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			throw new Exception("User Disabled");
//			
//		}
//	}
//	
//}
