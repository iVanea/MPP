package as4.personbirth;

final public class PersonBirthInfoImpl implements PersonBirthInfo{
	private Person person;
	private BirthInfo birthInfo;
	
	PersonBirthInfoImpl(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}

	public Person getPerson() {
		return person;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

}
