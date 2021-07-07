package homework2;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student student = new Student("uko98765@gmail.com","Java",26);
		student.setFirstName("Umut Kaan");
		student.setLastName("Ozdemir");
		student.setId(1);
		student.setPhoto(" : )");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setPhoto(": - )");
		instructor.setHomework("15. G�n");
		instructor.setId(2);
		instructor.setAbout("Ben Engin Demiro� MCT, PMP, ITIL sertifikalar�na sahibim...");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp(instructor);
		instructorManager.logIn(instructor);
		instructorManager.aboutMe(instructor);
		instructorManager.editDailyHomework(instructor);
		instructorManager.logOut(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(student);
		studentManager.logIn(student);
		studentManager.entrence(student);
		studentManager.editProfile(student);		
		studentManager.logOut(student);

		
		
		

	}

}
