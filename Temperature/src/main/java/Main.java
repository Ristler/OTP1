public class Main {
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();


        System.out.println(temp.fahrenheitToCelsius(20));
        System.out.println(temp.celsiusToFahrenheit(-6.666));
    }
}
