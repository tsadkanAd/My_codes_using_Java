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
public class ShiftSupervisor extends Employment{
    private double annualSalary;
    private double annualBonus;
    public ShiftSupervisor(){
        annualSalary = 0;
        annualBonus = 0;
    }
    public ShiftSupervisor(String name, String num, String date, double s, double b)throws InvalidEmployeeNumber{
        super(name, num, date);
        annualSalary = s;
        annualBonus = b;
    }
    public void setName(String name){
    super.setName(name);
    }
    public void setNum(String num)throws InvalidEmployeeNumber{
                        boolean good = true;
        if(num.length()<4)good = false;
        else if(num.length()==4){
            int i = 0;
            while(good&&i<3){
                if(!Character.isDigit(num.charAt(i))){
                    good = false;
                    break;
                }
                i++;
            }
            if(num.charAt(3)!='-'){
                good = false;
            }
            if(num.charAt(4)>=65||num.charAt(4)>=97&&num.charAt(4)>=77||num.charAt(4)<=109){
                StringBuilder a = new StringBuilder(num);
                a.setCharAt(4, Character.toUpperCase(num.charAt(4)));
                num = a.toString();
                good = true;
            }
            else good = false;
        }
        if(good)
    super.setNum(num);
        else 
            System.out.println("Incorrect employee num");
    }
    public void setDate(String date){
    super.setDate(date);
    }
    public void setSalary(double salary){
        annualSalary = salary;
    }
    public void setBonus(double bonus){
    annualBonus = bonus;
    }
    public String getName(){
        return super.getName();
    }
    public String getNum(){
        return super.getNum();
    }
    public String getDate(){
        return super.getDate();
    }
    public double getSalary(){
        return annualSalary;
    }
    public double getBonus(){
        return annualBonus;
    }
    
}
