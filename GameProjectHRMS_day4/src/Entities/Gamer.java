package Entities;

import java.time.LocalDate;

public class Gamer {
	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalityId;
	private LocalDate DateOfBirth;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId = nationalityId;
		DateOfBirth = dateOfBirth;
	}

	public int getId() {
		return Id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
}
