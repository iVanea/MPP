package prob2A;

public class Student {
	private String name;
	private GradeReport grade;
	
	public GradeReport getGrade() {
		return grade;
	}

	public void setGrade(GradeReport grade) {
		this.grade = grade;
	}
	public Student() {
	}
	public Student(GradeReport grade) {
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
