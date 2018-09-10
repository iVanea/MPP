package prob4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	Student bob = StudentSectionFactory.createStudent("000-12", "Bob");
	Student tim = StudentSectionFactory.createStudent("000-13", "Tim");
	Student allen = StudentSectionFactory.createStudent("000-14", "Allen");
	Student[] students = {bob, tim, allen};
	Section bio1 = StudentSectionFactory.createSection(1, "Biology");
	Section bio2 = StudentSectionFactory.createSection(2, "Biology");
	Section math = StudentSectionFactory.createSection(3, "Mathematics");
	
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		System.out.println(m.getTranscript(m.bob));
		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}
	
	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	private List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.grades;
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.grades) {
				if(!found) {
					if(te.grade.equals(grade)) {
						found = true;
						studentNames.add(s.name);
					}
				}
			}
		}
		return studentNames;
	}
	
	void readDataFromDb() {
		
		StudentSectionFactory.newTranscriptEntry(bob, bio1, "A");
		StudentSectionFactory.newTranscriptEntry(bob, math, "B");
		
		StudentSectionFactory.newTranscriptEntry(tim, bio1, "B+");
		StudentSectionFactory.newTranscriptEntry(tim, math, "A-");
		
		StudentSectionFactory.newTranscriptEntry(allen, math, "B");
		StudentSectionFactory.newTranscriptEntry(allen, bio2, "B+");
		
	}

}
