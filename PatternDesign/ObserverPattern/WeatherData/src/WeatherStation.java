import model.CurrentConditionsDisplay;
import model.StatisticsDisplay;
import model.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay
                (weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(32, 70, 29.2f);
        weatherData.setMeasurements(37, 90, 32.7f);
        weatherData.setMeasurements(47, 85, 28.7f);
    }
}
