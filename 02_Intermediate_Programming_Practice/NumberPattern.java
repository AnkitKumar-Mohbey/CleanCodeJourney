// Problem statement :- Print the following pattern for the given N number of rows :- Pattern for N = 4

/*  4444
    4444
    4444
    4444
*/

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :

// Integer N (Total no. of rows)

// Output format :

// Pattern in N lines

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows here :- ");
        int numberOfRows = scan.nextInt();

        for(int row = 1; row <= numberOfRows; row++){

            for(int column= 1; column <= numberOfRows; column++){
                System.out.print(numberOfRows);
            }
            System.out.println();
        }
        scan.close();
    }
}
