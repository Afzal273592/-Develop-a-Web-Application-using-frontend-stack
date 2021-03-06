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

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@Column(name = "roleid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roleId;
	
	@Column(name = "rolename")
	private String roleName;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role", targetEntity = UserRole.class)
	private Set<UserRole> userRoles =  new HashSet<>();
	
	
	public Role() {
		super();
		
	}

	public Role(Long roleId, String roleName, Set<UserRole> userRoles) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userRoles = userRoles;
	}


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public Set<UserRole> getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}


	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", userRoles=" + userRoles + "]";
	}


	
}
