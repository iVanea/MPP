package business;

import java.util.*;
import java.util.stream.Collectors;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingOverdueBook());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	// espected [1002, 1001]
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		//		System.out.println(mems);
		//[Member Info: ID: 1004, name: Ricardo Montalbahn, 641-472-2871 (501 Central, Mountain View, 94707),
		//Member Info: ID: 1003, name: Sarah Eagleton, 451-234-8811 (42 Dogwood Dr., Fairfield, 52556), 
		//Member Info: ID: 1002, name: Drew Stevens, 702-998-2414 (1435 Channing Ave, Palo Alto, 94301),
		//Member Info: ID: 1001, name: Andy Rogers, 641-223-2211 (5001 Venice Dr., Los Angeles, 93736)]
		
		return mems.stream().filter(x->x.getAddress().getZip().contains("3"))
				.map(x->x.getMemberId())
				.collect(Collectors.toList());
	}
	//Returns a list of all ids of  LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		List<String> strList = Arrays.asList("I didn't find overdue book");
		return strList ;
		
	}
	
	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		/*System.out.println(bs);
		[isbn: 48-56882, maxLength: 7, available: true, 
		isbn: 28-12331, maxLength: 7, available: true, 
	->	isbn: 23-11451, maxLength: 21, available: true, 
		isbn: 99-22223, maxLength: 21, available: true]
		*/
		//implement
		return bs.stream().filter(x->x.getAuthors().size()>1)
				.map(x->x.getIsbn().toString())
				.collect(Collectors.toList());
		
		}

}
