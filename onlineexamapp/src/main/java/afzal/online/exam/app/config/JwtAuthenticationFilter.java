//package afzal.online.exam.app.config;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//
//
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import afzal.online.exam.app.services.impl.UserDetailServiceImpl;
//import io.jsonwebtoken.ExpiredJwtException;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private UserDetailServiceImpl userDetailServiceImpl;
//
//	@Autowired
//	private jwtUtil jtUtil;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//
//		final String requestTokenheader = request.getHeader("Authorization");
//
//		String username = null;
//		String jwtToken = null;
//		
//		System.out.println(requestTokenheader.toString());
//
//		if (requestTokenheader != null && requestTokenheader.startsWith("Bearer ")) {
//			// yes
//			
//			jwtToken = requestTokenheader.substring(7);
//
//			try {
//				username = this.jtUtil.extractUsername(jwtToken);
//			} catch (ExpiredJwtException e) {
//
//				System.out.println("Token Expired");
//				e.printStackTrace();
//			} catch (Exception e) {
//
//				e.printStackTrace();
//				System.out.println("Error");
//			}
//
//		} else {
//			System.out.println("Invalid token, not Start with Bearer  ");
//		}
//
//		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//
//			final UserDetails userDetails = this.userDetailServiceImpl.loadUserByUsername(username);
//
//			if (this.jtUtil.validateToken(jwtToken, userDetails)) {
//
//				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//			}else {
//				System.out.println("Token is not Valid");
//			}
//			
//			filterChain.doFilter(request, response);
//		}
//
//	}
//
//}
