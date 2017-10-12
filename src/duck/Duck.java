package duck;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		flybehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flybehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
