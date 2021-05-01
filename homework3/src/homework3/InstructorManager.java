package homework3;

public class InstructorManager extends UserManager{
	public void createCourse(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "yeni kurs oluþturdu.");
		
	}
}

