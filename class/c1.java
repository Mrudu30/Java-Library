// Create a class name Temperature in which create methods of given name ferenhit(), celcius() to perform basic conversion. Call all this methods using class
// named Main.
class c1 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        System.out.println("100 Celsius in Fahrenheit: " + temp.toFahrenheit(100));
    }
}

class Temperature {
    public float toFahrenheit(float temp) {
        return temp * 9 / 5 + 32;
    }

    public float toCelsius(float temp) {
        return (temp - 32) * 5 / 9;
    }
}