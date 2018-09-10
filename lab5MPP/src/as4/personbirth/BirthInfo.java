package as4.personbirth;

import java.time.LocalDate;

final public class BirthInfo {
	private Person person;
	private LocalDate dateOfBirth;	
	
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	public Person getPerson() {
		return person;
	}

	void setPerson(Person person) {
		this.person = person;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
