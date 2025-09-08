public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;

    }
    public double celsiusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }
    public boolean isExtremeTemperature(double temp) {
        return temp > 50 || temp < -40;
    }
}
