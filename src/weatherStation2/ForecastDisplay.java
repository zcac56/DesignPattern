package weatherStation2;

import java.util.Observable;
import java.util.Observer;

import weatherStation.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.2f;
	private float lastPressure;
	private WeatherData weatherdata;
	
	public ForecastDisplay(Observable observable) {
		this.weatherdata = (WeatherData)observable;
		observable.addObserver(this);
	}
	
	public void display() {
		System.out.print("Forecast: ");
		if(currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if(currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if(currentPressure < lastPressure) {
			System.out.println("Watch out of coller, rainy weather");
		}
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			lastPressure = currentPressure;
			currentPressure = weatherdata.getPressure();
			display();
		}
	}

}
