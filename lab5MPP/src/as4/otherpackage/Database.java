package as4.otherpackage;

import java.util.*;


public class Database {
	public static HashMap<String, DataRecord> h = new HashMap<>();
	static {
		h.put("1", new DataRecord("1", "Bob", 1986, 11, 23));
		h.put("2", new DataRecord("2", "Alan", 1984, 7, 12));
		h.put("3", new DataRecord("3", "Dave", 1990, 11, 25));
		h.put("4", new DataRecord("4", "Perry", 1995, 3, 9));
	}
}
