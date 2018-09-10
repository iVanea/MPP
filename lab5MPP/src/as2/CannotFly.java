package as2;

public class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("\tcannot fly");
	}

}
