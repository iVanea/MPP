package prob4;

public class RubberDuck extends Duck{

	public RubberDuck() {

	}

	@Override
	void fly() {
		(new CannotFly() {}).fly();
		
	}

	@Override
	void quack() {
		(new Squeak() {}).quack();
	}
	
}
