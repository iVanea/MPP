package assignment2;

public class MallardDuck extends Duck {
	
//	public void display(){
//		System.out.println("\n Mallard Duck:");
//	}
	
	FlyBehavior fww = new FlyWithWings();
	QuackBehavior qb = new Quack();
	
	public void fly(){
		fww.fly();
	}
	
	public void quack(){
		qb.quack();
	}

}
