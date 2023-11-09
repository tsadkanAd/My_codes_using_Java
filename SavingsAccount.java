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
public class SavingsAccount {
    private double interestRate;
    private double balance;
   public SavingsAccount(double b){
    balance = b;
    }
   public SavingsAccount(){
    balance = 0;
    interestRate = 0;
    }
   public SavingsAccount(SavingsAccount object){
   balance = object.balance;
   }
    public void withdraw(double w){
    balance-=w;
    }
    public void deposit(double d){
    balance+=d;
    }
    public double interest(){
    double monthly = balance*(interestRate/12);
    balance+=monthly;
    return monthly;
    }
    public double getBalance(){
    return balance;
    }
    public void setRate(double r){
    interestRate = r;
    }
}
