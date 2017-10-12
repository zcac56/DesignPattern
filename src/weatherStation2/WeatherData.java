package weatherStation2;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}
	
	public void measurementsChange() {
		setChange();
		
	}
}
