package Loan;

import java.util.*;
import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(double annualInterestRate, int numOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numOfYears = numOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numOfYears) {
        this.numOfYears = numOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = (this.annualInterestRate/100) / 12;
        double loanAmt = this.loanAmount * monthlyInterestRate;
        double monthlyPayment = Math.pow(1+monthlyInterestRate, numOfYears * 12);
        double totalMonthlyPayment = 1 - (1/monthlyPayment);
        double finalMonthlyPayment = loanAmt / totalMonthlyPayment;
        return finalMonthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * getNumberOfYears() * 12;
    }
}
