package afzal.online.exam.app.models.exam;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "categoryTable")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long cId;
	
	@Column(name = "title" , length = 5000)
	private String title;
	
	@Column(name = "description" , length = 5000)
	private String description;
	
	
	@OneToMany(mappedBy = "category" ,  cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Quiz> quizSet = new LinkedHashSet<>();


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(Long cId, String title, String description, Set<Quiz> quizSet) {
		super();
		this.cId = cId;
		this.title = title;
		this.description = description;
		this.quizSet = quizSet;
	}


	public Long getcId() {
		return cId;
	}


	public void setcId(Long cId) {
		this.cId = cId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Quiz> getQuizSet() {
		return quizSet;
	}


	public void setQuizSet(Set<Quiz> quizSet) {
		this.quizSet = quizSet;
	}


	@Override
	public String toString() {
		return "Category [cId=" + cId + ", title=" + title + ", description=" + description + ", quizSet=" + quizSet
				+ "]";
	} 
	
	

	
}
