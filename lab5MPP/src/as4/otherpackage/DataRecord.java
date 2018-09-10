package as4.otherpackage;

import java.time.LocalDate;

public class DataRecord {
	String id;
	String name;
	LocalDate birthdate;
	public DataRecord(String id, String name, int year, int month, int dayOfMonth) {
		this.id = id;
		this.name = name;
		this.birthdate.of(year, month, dayOfMonth);
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	
}
