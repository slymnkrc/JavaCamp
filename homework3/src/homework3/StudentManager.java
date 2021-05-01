package homework3;

public class StudentManager extends UserManager{
	
	public void takeCourse(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "Kursa Kayýt Ýþleminiz Tamamlandý");
	}

}
