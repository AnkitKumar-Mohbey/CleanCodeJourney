import java.util.Scanner;

public class AverageCalculator{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Declare variables to hold the three numbers
        int firstNumber, secondNumber, thirdNumber;
        int numberOfInputs = 3; // Using a constant for clarity
        double averageOfNumbers; // Use double for accurate division

        // Prompt user for input
        System.out.println("Enter three numbers:");

        // Read inputs from the user
        firstNumber = scan.nextInt();
        secondNumber = scan.nextInt();
        thirdNumber = scan.nextInt();

        // Calculate the average
        averageOfNumbers = (firstNumber + secondNumber + thirdNumber) / (double) numberOfInputs;

        // Output the result
        System.out.println("The average of the numbers is: " + averageOfNumbers);

        // Close the scanner to avoid resource leaks
        scan.close();
    }
}