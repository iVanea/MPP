package prob4;

public interface FlyBehavior {
	//public abstract void fly();
	default void fly() {
		System.out.println("\tfly with wings");
	}
}
