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
public class SavingAccount extends BankAccount{
    public SavingAccount(){
    super();
    }
    public SavingAccount(double dep, double intR){
    super(dep,intR);
    }
    private boolean status;
    public void withdraw(double wit){
        if(status)
            super.withdraw(wit);
    }
    public void deposit(double dep){
        if(!status)
            if(balance+dep>25)
                status = true;
        super.deposit(dep);
    }
    public void monthlyProcess(){
        if(withdraw>4){
            for(int i = 1; i < withdraw-4; i++)
            monthlyServiceCharge++;
        }   
        super.monthlyProcess();
        if(balance<=25)
            status = false;
    }
}
