package Loan;

import java.util.Date;
import java.util.Scanner;

public class LoanTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 9.25: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numOfYears = sc.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmt = sc.nextDouble();
        sc.close();
        Loan specificLoan = new Loan(interestRate, numOfYears, loanAmt);
        specificLoan.setLoanDate(new Date());
        System.out.println("The loan was created on " + specificLoan.getLoanDate().toString());
        System.out.println("The monthly payment is " + Math.round((specificLoan.getMonthlyPayment()) * 100.0) / 100.0);
        System.out.println("The total payment is " + Math.round((specificLoan.getTotalPayment()) * 100.0) / 100.0);
    }
}
