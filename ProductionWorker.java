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
public class ProductionWorker extends Employment{
    private int shift;
    private double payRate;
    public ProductionWorker(){
    super();
    shift = 0;
    payRate = 0;
    }
    public ProductionWorker(int s, double p, String d, String n, String num)throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber{
    super(n,num,d);
    if(s!=1&&s!=2)
        throw new InvalidShift();
    shift = s;
    if(p<0)
        throw new InvalidPayRate();
    payRate = p;
    }
    public void setName(String n){
    super.setName(n);
    }
    public String getName(){
    return super.getName();
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
    public boolean checker(String num)throws InvalidEmployeeNumber{
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
        return good;
    }
    public String getNum(){
    return super.getNum();
    }
    public void setDate(String d){
    super.setDate(d);
    }
    public String getDate(){
    return super.getDate();
    }
    public void setShift(int s)throws InvalidShift{
        if(s!=1&&s!=2)
            throw new InvalidShift();
    shift = s;
    }
    public void setPayRate(double p)throws InvalidPayRate{
        if(p<0)
            throw new InvalidPayRate();
    payRate = p;
    }
    public String getShift(){
        if(shift==1)return "Day";
        else return "Night";
    }
    public double getPayRate(){
    return payRate;
    }
}
