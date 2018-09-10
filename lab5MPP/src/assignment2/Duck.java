package assignment2;

public abstract class Duck {
	
	
	public void display(){
		System.out.println("\tdisplay");
	}
	
	public void swim(){
		System.out.println("\tswimming");
	}
	
	
	abstract void fly();
	
	abstract void quack();
}
