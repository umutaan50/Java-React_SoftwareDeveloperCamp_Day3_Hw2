package homework2;

public class InstructorManager extends UserManager {	
	
	public void editDailyHomework(Instructor instructor) {
		System.out.println(instructor.getHomework() + " ödevi düzenlenmiþtir sayýn : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}
	public void aboutMe(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " hakkýndaki bilgiler: " + instructor.getAbout());
	}

}
