package decorator.starbuzz;

public class Whip extends CondimentDecorator {
	Beverage beeverage;
	
	public Whip(Beverage beverage) {
		this.beeverage = beverage;
	}

	public String getDescription() {
		return beeverage.getDescription() + ", Whip";
	}

	public double cost() {
		return 0.10 + beeverage.cost();
	}
}
