/*
 Problem Statement:
 Given an integer N, print a right-angled triangle pattern of stars with N rows.
 
  with the Nth row containing N stars.  

  Example:
  For N = 4, the output would be:

  *
  **
  ***
  ****  

  Input Format:
  Integer N (number of rows in the triangle)  

  Output Format:
  N lines where the ith line contains i stars.  
  Constraints:
  0 <= N <= 50
 */

import java.util.Scanner;

public class StarTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        int totalRows = scan.nextInt();

        // let row = i and column = j

        for(int i = 1; i <= totalRows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}