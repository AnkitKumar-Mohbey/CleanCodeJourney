import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber;
        int numberOfInputs = 3;  // Using a constant for clarity
        double averageOfNumbers;  // Use double for accurate division

        // Read inputs from the user
        System.out.println("Enter First numbers: ");
        firstNumber = scan.nextInt();
        System.out.println("Enter Second numbers: ");
        secondNumber = scan.nextInt();
        System.out.println("Enter Third numbers: ");
        thirdNumber = scan.nextInt();

        // Calculate the average
        averageOfNumbers = (firstNumber + secondNumber + thirdNumber) / (double) numberOfInputs;

        // Output the result
        System.out.println("The average of number is: " + averageOfNumbers);

        // Close the scanner to avoid resource leaks
        scan.close();

    }
}
