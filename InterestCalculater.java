import java.util.Scanner;

public class InterestCalculater{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int principalAmount, numberOfYears;
        double intrestRate, totalInterest;

        System.out.println("Enter the principal amount: ");
        principalAmount = scan.nextInt();
        System.out.println("Enter the number of years");
        numberOfYears = scan.nextInt();
        System.out.println("Enter the number of rate");
        intrestRate = scan.nextInt();

        totalInterest = ((principalAmount * intrestRate * numberOfYears)/(double)100);
        System.out.println("Total intrest is " + totalInterest);

        scan.close();
    }
}