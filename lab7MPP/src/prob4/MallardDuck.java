package prob4;

public class MallardDuck extends Duck{
	//FlyBehavior fb;

	public MallardDuck() {
		
	}
	
	@Override
	public void display() {
		System.out.println("\tdisplay");
		
	}
	@Override
	public void fly(){
		(new FlyBehavior() {}).fly();
	}
	
	@Override
	public void quack(){
		(new QuackBehavior() {}).quack();
	}
	
	
	
}
