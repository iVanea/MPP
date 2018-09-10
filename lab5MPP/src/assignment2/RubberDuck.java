package assignment2;

public class RubberDuck extends Duck{
//	public void display(){
//		System.out.println("\n Rubber Duck:");
//	}
	
	FlyBehavior fww = new CannotFly();
	QuackBehavior qb = new Squeak();
	
	public void fly(){
		fww.fly();
	}
	
	public void quack(){
		qb.quack();
	}
}
