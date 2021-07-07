package homework2;

public class StudentManager extends UserManager {

	
	
	public void editProfile(Student student) {
		System.out.println("Profil bilgileri: " + student.getEmail() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getPhoto() );
	}
	public void entrence(Student student) {
		System.out.println(" Completed percent of course "+ student.getCourse() +": %" + student.getPercentageCompleted());
	}
	
	
	
}
