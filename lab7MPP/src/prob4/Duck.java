package prob4;

public class Duck {
	FlyBehavior fb;
	QuackBehavior qb;

	public void swim() {
		System.out.println("\tswimming");
	}

	void display() {
		System.out.println("\tdisplaying");
	}

	void fly() {
		fb.fly();
	}
	void quack() {
		qb.quack();
	}

	// abstract void quack();
}
