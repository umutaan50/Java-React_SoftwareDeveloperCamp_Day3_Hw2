package homework2;

public class InstructorManager extends UserManager {	
	
	public void editDailyHomework(Instructor instructor) {
		System.out.println(instructor.getHomework() + " �devi d�zenlenmi�tir say�n : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}
	public void aboutMe(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " hakk�ndaki bilgiler: " + instructor.getAbout());
	}

}
