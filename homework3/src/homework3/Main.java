package homework3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Engin" , "Demirog" , "enginInstructor@email.com" , 1001);
		Student student = new Student("Suleyman" , "Karaca" , "slymnkrc@email.com" , 2001);
		
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.login(student);
		userManager.login(instructor);
		
		userManager.logout(student);
		userManager.logout(instructor);
		
		instructorManager.createCourse(instructor);
		studentManager.takeCourse(student);
		
		

	}

}
