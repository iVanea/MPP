package prob4;

public class DecoyDuck extends Duck{

	public DecoyDuck() {

	}
	@Override
	void fly() {
		(new CannotFly() {}).fly();		
	}

	@Override
	void quack() {
		(new MuteQuack() {}).quack();		
	}

}
