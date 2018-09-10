package as4.personbirth;

import java.time.LocalDate;

final public class PersonBirthInfoFactory {
	private PersonBirthInfoFactory() {}
	
	public static PersonBirthInfo CreateInstance(String name, LocalDate localdate) {
		Person person = new Person(name);
		BirthInfo binfo = new BirthInfo(localdate);
		
		person.setBirthInfo(binfo);
		binfo.setPerson(person);
		
		return new PersonBirthInfoImpl(person, binfo);
		
	}
	
}
