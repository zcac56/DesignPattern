package WeatherStation;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forcastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.SetMeasurements(80, 65, 30.4F);
		weatherData.SetMeasurements(82, 70, 29.2F);
		weatherData.SetMeasurements(78, 90, 29.2F);
	}
}
