import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read the start (S), end (E), and step size (W) values
        int startFahrenheit = scan.nextInt();
        int endFahrenheit = scan.nextInt();
        int stepSize = scan.nextInt();

        // Loop through the Fahrenheit values from start to end in steps of W
        for (int currentFahrenheit = startFahrenheit; currentFahrenheit <= endFahrenheit; currentFahrenheit += stepSize) {
            // Convert the current Fahrenheit value to Celsius
            int celsius = (int)((currentFahrenheit - 32) * 5.0 / 9.0);

            // Print the Fahrenheit and corresponding Celsius value
            System.out.println(currentFahrenheit + " " + celsius);
        }

        // Close the scanner
        scan.close();
    }
}
