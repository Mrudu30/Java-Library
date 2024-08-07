// Create a class name Temperature in which create methods of given name
// ferenhit(), celcius() to perform basic conversion. Call all this methods using class
// named Main.
public class Temperature {
    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double toCelsius() {
        return (temperature - 32) * 5 / 9;
    }

    public double toFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature(32);
        System.out.println("Fahrenheit in Celsius is: " + t1.toCelsius());

        Temperature t2 = new Temperature(0);
        System.out.println("Celsius in Fahrenheit is: " + t2.toFahrenheit());
    }
}
