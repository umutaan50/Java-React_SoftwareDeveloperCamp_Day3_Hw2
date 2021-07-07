package homework2;

public class Student extends User {

	private String email;
	private int percentageCompleted;
	private String course;
	
	public Student(String email, String course, int percentageCompleted) {
		this.email = email;
		this.course = course;
		this.percentageCompleted = percentageCompleted;		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPercentageCompleted() {
		return percentageCompleted;
	}

	public void setPercentageCompleted(int percentageCompleted) {
		this.percentageCompleted = percentageCompleted;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	
	
	
	
}
