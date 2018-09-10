package prob4;

public class RedheadDuck extends Duck{
	
	
	public RedheadDuck() {

	}
	@Override
	void fly() {
		(new FlyBehavior() {}).fly();
		
	}

	@Override
	void quack() {
		(new QuackBehavior() {}).quack();
	}

}
