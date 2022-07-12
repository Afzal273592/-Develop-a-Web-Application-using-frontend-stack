package afzal.online.exam.app.models.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "questionTable")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long quesId;
	
	@Column(name = "content" , length = 500)
	private String content;
	
	@Column(name = "image" )
	private String image;
	
	@Column(name = "option1" , length = 500)
	private String option1;
	
	@Column(name = "option2" , length = 500)
	private String option2;
	
	@Column(name = "option3" , length = 500)
	private String option3;
	
	@Column(name = "option4" , length = 500)
	private String option4;
	
	@Column(name = "answer" , length = 500)
	private String answer;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Quiz quiz;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Long quesId, String content, String image, String option1, String option2, String option3,
			String option4, String answer, Quiz quiz) {
		super();
		this.quesId = quesId;
		this.content = content;
		this.image = image;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.quiz = quiz;
	}

	public Long getQuesId() {
		return quesId;
	}

	public void setQuesId(Long quesId) {
		this.quesId = quesId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Quiz getquiz() {
		return quiz;
	}

	public void setquiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", content=" + content + ", image=" + image + ", option1=" + option1
				+ ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", answer=" + answer
				+ ", quiz=" + quiz + "]";
	}

	



	
}
