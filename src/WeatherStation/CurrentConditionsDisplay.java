package WeatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherDate) {
		this.weatherData = weatherDate;
		weatherDate.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current condition: " + temperature + "F degree and " + humidity + "% humidity");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
