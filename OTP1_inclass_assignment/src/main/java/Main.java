public class Main {
    public static void main(String[] args) {
        System.out.println("Temperature Converter running...");
        // You can call your TemperatureConverter methods here for testing
        double c = TemperatureConverter.kelvinToCelsius(300);
        System.out.println("300 K = " + c + " °C");
    }
}