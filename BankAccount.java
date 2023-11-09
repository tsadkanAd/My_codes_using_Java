/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author TA
 */
public abstract class BankAccount {
    protected double balance = 0;
    private int deposit = 0;
    protected int withdraw = 0;
    private double interestRate;
    protected double monthlyServiceCharge;
    public BankAccount(){
    balance = 0;
    deposit = 0;
    withdraw = 0;
    interestRate = 0;
    monthlyServiceCharge = 0;
    }
    public BankAccount(double b, double intR){
    balance = b;
    interestRate = intR;
    }
    public void deposit(double dep){
        balance += dep;
        deposit++;
    }
    public void withdraw(double wit){
        balance -= wit;
        withdraw++;
    }
    public void calcInterest(){
    double MIT;//Monthly interest rate
    double MI;//Monthly interest
    MIT = interestRate / 12;
    MI = MIT * balance;
    balance += MI;
    }
    public void monthlyProcess(){
    balance -= monthlyServiceCharge;
    calcInterest();
    deposit = 0;
    withdraw = 0;
    monthlyServiceCharge = 0;
    }
}
