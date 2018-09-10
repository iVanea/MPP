package prob2;

import java.util.ArrayList;
import java.util.List;
import prob2.Department;

public class Admin {
	// implement
	Department[] departments;

	public Admin(Department[] departments) {
		this.departments = departments;
	}

	public String hourlyCompanyMessage() {
		List<StringQueue> messages = new ArrayList<>();
		try {
			for (Department d : departments) {
				messages.add(d.getQueue());
			}
		} catch (EmptyQueueException x) {
			System.out.println(x.getMessage());
		}

		return format(messages);
	}

	public String format(List<StringQueue> messages) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < departments.length; i++) {
			sb.append(departments[i].getName() + ": " + departments[i].nextMessage() + "\n");
		}
		return sb.toString();
	}
}
