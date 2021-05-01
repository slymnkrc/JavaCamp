package homework3;

public class User {
	
	
	private String firstName;
	private String lastName;
	private String email;
	
	
	public User (String firstName, String lastName, String email) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
	}
	
	//firstname
	public String getFirstName ( ) {
		return firstName;
	}
	
	public void setFirstName (String firstName ) {
		this.firstName = firstName;
	}
	//lastname
	public String getLastName ( ) {
		return lastName;
	}
	
	public void setLastName (String lastName ) {
		this.lastName = lastName;
	}
	//email
	public String getEmail ( ) {
		return email;
	}
	
	public void setEmail (String email ) {
		this.email = email;
	}
	
}
