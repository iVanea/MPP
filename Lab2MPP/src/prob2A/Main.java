package prob2A;

public class Main {
	public static void main (String args) {
		GradeReport gr = new GradeReport();
		Student st = new Student();
		
	
		st.setName("Alex");	
		gr.setStudent(st);
		
		st.setGrade(gr);
	}
}
