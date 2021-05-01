package homework3;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "Giriþ Yapýldý.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "Çýkýþ Yapýldý");
	}
	

}
