// Problem statement: Given a character, you need to print the ASCII value of that character.
// Time Limit: 1-sec


import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {
        
        // Create a Scanner object for Input
        Scanner scan = new Scanner(System.in);

        // Ask The User how many test cases
        System.out.println("Enter the number of test cases:"); 
        int teseCases = scan.nextInt();

        // Ensure that the number of test case is between 1 to 10 
        if (teseCases < 1 || teseCases > 10){
            System.out.println("Invalid number of the test cases. please enter between 1 and 10");
            return;
        }

        // Loop through each test case
        for(int i = 0; i < teseCases; i++){
            System.out.println("Enter a character:");
            char ch = scan.next().charAt(0);

            int ASCII_Value = (int) ch;
            System.out.println("The ASCII value of '" + ch + "' is: " + ASCII_Value);
        }

        scan.close();
    }
}