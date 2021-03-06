//package afzal.online.exam.app.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import afzal.online.exam.app.services.impl.UserDetailServiceImpl;
//
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Configuration
//public class MySecurityConfig  extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	private UserDetailServiceImpl userDetailServiceImpl;
//	
//	@Autowired
//	private JwtAuthenticationEntryPoint unauthorizedHandler;
//	
//	@Autowired
//	private JwtAuthenticationFilter jwtAuthenticationFilter;
//	
////	@Override
////	public AuthenticationManager authenticationManagerBean()throws Exception
//	
//	@Override
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		// TODO Auto-generated method stub
//		return super.authenticationManagerBean();
//	}
//	
////	@Bean
////	public BCryptPasswordEncoder passowrEncoder() {
////		
////		return new BCryptPasswordEncoder();
////		
////	}
////	
//	@Bean
//	public PasswordEncoder passowrEncoder() {
//		
//		return NoOpPasswordEncoder.getInstance();
//		
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//		auth.userDetailsService(this.userDetailServiceImpl).passwordEncoder(passowrEncoder());
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		
//			http.csrf().disable()
//			.cors().disable()
//			.authorizeRequests().antMatchers( "/generate-token", "/user/").permitAll()
//			.antMatchers(HttpMethod.OPTIONS).permitAll()
//			.anyRequest().authenticated()
//			.and()
//			.exceptionHandling().authenticationEntryPoint(unauthorizedHandler);
//			
//			http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//			
//			http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//		
//	}
//	
//}
