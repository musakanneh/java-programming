package ProblemSolving.SimpleProjects;

import java.text.NumberFormat;
import java.util.Scanner;

class MortgageCalculator {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;
    static int principal = 0;
    static float monthlyInterest;
    static int numberOfPayment;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getPrincipal();
        getAnnualInterestRate();
        getPeriod();
        calculateMortgage();
    }

    static void calculateMortgage(){
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)
                / Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    static void getPrincipal(){
        while (true ) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 100 && principal <= 1_000_000) break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
    }

    static void getAnnualInterestRate(){
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }

            System.out.println("Enter a value between 1 and 30");
        }
    }

    static void getPeriod(){
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayment = years * MONTHS_IN_YEAR;
                break;
            }

            System.out.println("Enter a value between 1 and 30");
        }
    }
}
