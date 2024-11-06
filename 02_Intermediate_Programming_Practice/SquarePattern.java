// Print the following pattern for the given N number of rows.
// Pattern for N = 3

//     ####
//     ####
//     ####

import java.util.Scanner;

public class SquarePattern{
    public static void main(String args[]){

        System.out.println("Enter number of rows here : ");
        Scanner scan = new Scanner(System.in);

        int numberOfRows = scan.nextInt();

        for(int row = 1; row <= numberOfRows; row++){

            for(int col = 1; col <= numberOfRows; col++){
                System.out.print("#");
            }

            System.out.println();
        }
        
        scan.close();
    }
}