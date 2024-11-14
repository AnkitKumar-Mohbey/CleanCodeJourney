/*
 Problem Statement:

  You are given an integer N, representing the number of rows. 
  Print a right-angled triangle pattern where each row contains 
  a sequence of the row number repeated as many times as the row number.  

  Example:
  For N = 5, the output would be:

  1
  22
  333
  4444
  55555  

  Input Format:

    A single integer N representing the number of rows. 

  Output Format:

    A pattern where the first row contains 1, 
    the second row contains 2 2, 
    the third row contains 3 3 3, 
    and so on, up to the Nth row. 

  Constraints:
  1 <= N <= 50
 */

 import java.util.Scanner;

public class NumberTrianglePattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Row numbers : ");
        // Input the number of rows N
        int N = scan.nextInt();

        // let i = row and j = column
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        scan.close();
    }
}