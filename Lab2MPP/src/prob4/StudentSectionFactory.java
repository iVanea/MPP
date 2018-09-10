package prob4;

public class StudentSectionFactory {
	
	public static Student createStudent(String id, String name) {
		if(id == null || name == null)
			throw new IllegalArgumentException("Id and name must be non null");
		Student student = new Student();
		student.id = id;
		student.name = name;
		
		return student;
	}
	
	public static Section createSection(int secNum, String courseName) {
		if(secNum == 0 || courseName == null)
			throw new IllegalArgumentException("section number and course name must be non null");
		Section section = new Section();
		section.sectionNumber = secNum;
		section.courseName = courseName;
		return section;
	}
	
	public static void newTranscriptEntry(Student s, Section sect, String grade) {
		
		if(s == null)
			throw new IllegalArgumentException("Student must be non null");
		if(sect == null)
			throw new IllegalArgumentException("Section must be non null");
		if(grade == null)
			throw new IllegalArgumentException("Grade must be non null");
		
		TranscriptEntry te = new TranscriptEntry();
		te.grade = grade;
		te.student = s;
		te.section = sect;
		
		s.grades.add(te);
		sect.gradeSheet.add(te);
		
	}

}
