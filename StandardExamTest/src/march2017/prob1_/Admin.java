package march2017.prob1_;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		/*
		 * In this problem, you will create a Stream pipeline to output the list of all Students from the
		 * original list that have a gpa greater than 3.0 and have a major of "Computer Science".
		 */
		
//		System.out.println(list.stream().filter(x->x.getGpa()>3.0 && x.getMajor().equals(Majors.CS)).collect(Collectors.toList()));
		return list.stream().filter(x->x.getGpa()>3.0 && x.getMajor().equals(Majors.CS)).collect(Collectors.toList());
	}
}
