package prob4;

public interface QuackBehavior{

	//public abstract void quack();
	default void quack() {
		System.out.println("\tquacking");
	}
	
}
