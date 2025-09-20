

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (double) Math.round(((fahrenheit - 32) * 5 / 9) * 100) / 100;

    }
    public double kelvinToCelsius(double kelvin) {
        return (double) Math.round((kelvin - 273.15) * 100) / 100;
    }

    public double celsiusToFahrenheit(double celcius) {
        return (double) Math.round(((celcius * 9 / 5) + 32) * 100) / 100;
    }
    public boolean isExtremeTemperature(double temp) {
        return temp > 50 || temp < -40;
    }
}
