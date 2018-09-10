package as2;

public abstract class Duck implements FlyBehavior, QuackBehavior {

	public abstract void display();

	public void swim() {
		System.out.println("\tswimming");
	}

	@Override
	public void fly() {
		FlyBehavior fb;
		switch (this.getClass().getSimpleName()) {
		case "RubberDuck":
		case "DecoyDuck":
			fb = new CannotFly();
			fb.fly();
			break;
		case "MallardDuck":
		case "RedheadDuck":
			fb = new FlyWithWings();
			fb.fly();
			break;
		}
	}

	@Override
	public void quack() {
		QuackBehavior qb;
		switch (this.getClass().getSimpleName()) {
		case "RubberDuck":
			qb = new Squeak();
			qb.quack();
			break;
		case "DecoyDuck":
			qb = new MuteQuack();
			qb.quack();
			break;
		case "MallardDuck":
		case "RedheadDuck":
			qb = new Quack();
			qb.quack();
			break;
		}

	}

}
