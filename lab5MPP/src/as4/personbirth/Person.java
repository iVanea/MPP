package as4.personbirth;

final public class Person {
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

	void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}
	
}
