package afzal.online.exam.app.models;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
//implements UserDetails
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private Long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "userpassword")
	private String password;
	
	@Column(name = "userfirstname")
	private String firstname;
	
	@Column(name = "userlastname")
	private String lastname;
	
	@Column(name = "useremail")
	private String email;
	
	@Column(name = "userphone")
	private String phone;
	
	@Column(name = "userenabled")
	private boolean enabled=true;
	
	@Column(name = "userprofile")
	private String profile;
	
	@Column(name = "usertype")
	private String usertype;

	
	// user Many Roles 
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user", targetEntity = UserRole.class)
	@JsonIgnore
	private Set<UserRole> userRoles = new HashSet<>(); 
		

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(Long id, String username, String password, String firstname, String lastname, String email,
			String phone, boolean enabled, String profile, String usertype, Set<UserRole> userRoles) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.profile = profile;
		this.usertype = usertype;
		this.userRoles = userRoles;
	}


	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	public String getUsername() { return username;	}

	public void setUsername(String username) { this.username = username; }

	public String getPassword() { return password; }

	public void setPassword(String password) { this.password = password; }

	public String getFirstname() { return firstname; }

	public void setFirstname(String firstname) { this.firstname = firstname; }

	public String getLastname() { return lastname; }

	public void setLastname(String lastname) { this.lastname = lastname; }

	public String getEmail() {	return email; }

	public void setEmail(String email) { this.email = email; }

	public String getPhone() { return phone; }

	public void setPhone(String phone) { this.phone = phone; }

	public boolean isEnabled() {	return enabled; }

	public void setEnabled(boolean enabled) { this.enabled = enabled; }

	public String getProfile() { return profile; }

	public void setProfile(String profile) { this.profile = profile; }

	public Set<UserRole> getUserRoles() { return userRoles; }

	public void setUserRoles(Set<UserRole> userRoles) { this.userRoles = userRoles; }

	public String getUsertype() { return usertype; }

	public void setUsertype(String usertype) { this.usertype = usertype; }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", phone=" + phone + ", enabled=" + enabled
				+ ", profile=" + profile + ", usertype=" + usertype + ", userRoles=" + userRoles + "]";
	}


//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		
//		Set<Authority> authoritiesSet = new HashSet<>();
//		
//		this.userRoles.forEach(userRole ->{
//			authoritiesSet.add(new Authority(userRole.getRole().getRoleName()));
//		});
//		
//		return null;
//	}
//
//
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//

	
	

	
	
}
