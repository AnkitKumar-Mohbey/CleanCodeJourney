// Problem Statement:
// Given an integer N, print a reverse alphabetical triangle pattern.
// Each row starts with 'E' and decreases in reverse alphabetical order.
// The number of columns in each row corresponds to the row number.

import java.util.Scanner;

public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input: Number of rows
        System.out.print("Enter the number of rows (1 ≤ N ≤ 26): ");
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            char ch = (char) ('A' + N - 1); // Determine the starting character based on N
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--; // Decrease the character in reverse alphabetical order
            }
            System.out.println();
        }

        scan.close();
    }
}
