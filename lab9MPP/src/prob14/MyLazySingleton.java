package prob14;

import java.util.Optional;

public class MyLazySingleton {
	public static int count=0;
	private static String text = "lazy here" ;
	private static MyLazySingleton instance = null;

	private MyLazySingleton() {
		count++;
		System.out.println("_"+count);
	}

	@Override
	public String toString() {
		return text;
	}
	
	public static MyLazySingleton getInstance() {
		return Optional.ofNullable(instance).orElseGet(MyLazySingleton::new);
//		if (instance == null)
//			instance = new MyLazySingleton();
//		return instance;
		
		
	}
	
	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			MyLazySingleton.getInstance();
		}
		
		System.out.println(MyLazySingleton.count);
		
	}
}
