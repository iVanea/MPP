package assignment6_1;
public class MyTable {
	private static Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		int index = getIndexfromChar(c);
		return entries[index].getString();
	}

	public void add(char c, String s) {
		int index = getIndexfromChar(c);
		entries[index] = new Entry(c, s);
	}

	public int getIndexfromChar(char c) {

		return (int) c - 97;
	}

	public String toString() {
		if(entries == null) return "null string";
		
		StringBuilder sd = new StringBuilder();
		for (int i = 0; i < entries.length; i++ ) {
			if (entries[i] != null ) {
				sd.append(entries[i].toString() +"\n");
			}
			
		}
		return sd.toString();
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('c', "Charlie");
		String s = t.get('b');
		System.out.println(s);
		
		MyTable t2 = new MyTable();
		t2.add('a', "Andrew");
		t2.add('b',"Billy");
		t2.add('w',"Willie");
		System.out.println(t2.toString());

	}

	private class Entry {
		String st;
		char cr;

		Entry(char ch, String str) {
			this.st = str;
			this.cr = ch;
		}

		public String getString() {

			return this.st;
		}

		public String toString() {
			
			String s = this.cr+"->"+this.st;
			return s ;
		}
	}

}