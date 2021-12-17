package test4;

import java.util.*;

public class WeatherForecaster {
	private Random random;
	
	public WeatherForecaster() {
		this.random = new Random();
	}
	
	public String forecastWeather() {
		double probability = this.random.nextDouble();
		
		if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "Snow";
        } else { // the rest, 1.0 - 0.4 = 0.6
            return "Sunny";
        }
	}
	
	public int forecastTemperature() {
		return (int) ( 4 * this.random.nextGaussian() - 3 );
	}
}
