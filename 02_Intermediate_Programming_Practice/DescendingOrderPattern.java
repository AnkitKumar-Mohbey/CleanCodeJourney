/*
 Problem Statement:

  You are given an integer N, representing the number of rows. 
  Printthe following pattern for the given N number of rows.
  
  Note: Print space between the numbers.


  Example:
  For N = 5, the output would be:

  5
  5 4
  5 4 3
  5 4 3 2 
  5 4 3 2 1

  Constraints:
  0 <= N <= 50
 */

 import java.util.Scanner;

public class DescendingOrderPattern{
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Numbber here: ");
        int N = scan.nextInt();
        // let i be the number of rows and j be the number of columns
        for(int i = 1; i <= N; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(N-i+1 + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}