package homework3;

public class Instructor extends User {
	
	int id;
	
	public Instructor(String firstName, String lastName, String email, int id) {
		
		super(firstName, lastName, email);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
