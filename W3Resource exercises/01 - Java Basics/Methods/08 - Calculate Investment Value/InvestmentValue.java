// Write a Java method to compute the future investment value at a given interest rate for a specified number of years.

import java.util.Scanner;

public class InvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount you would like to invest: ");
        double amount = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble()/100;

        System.out.print("Enter the years of interest: ");
        int years = input.nextInt();

        System.out.printf("%-5s %s%n", "Years", "Future Value");

        for (int i = 1; i <= years; i++) {
            double futureValue = amount * Math.pow(1 + rate, i);
            System.out.printf("%-5d %.2f%n", i, futureValue);
        }
    }

}
