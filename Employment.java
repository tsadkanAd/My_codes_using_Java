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
public class Employment {
    private String empName;
    private String empNum;
    private String hireDate;
    public Employment(){
    empName = "";
    empNum = "";
    hireDate = "";
    }
    public Employment(String a, String num, String c)throws InvalidEmployeeNumber{
            empName = a;
    hireDate = c;
            boolean good = true;
        if(num.length()<5||num.length()>5)good = false;
        else if(num.length()==5){
            int i = 0;
            while(good&&i<5){
                if(!Character.isDigit(num.charAt(i))){
                    good = false;
                    break;
                }
                i++;
            }
            if(num.charAt(3)!='-'){
                good = false;
            }
            if(num.charAt(4)>=65||num.charAt(4)<=97&&num.charAt(4)>=77||num.charAt(4)<=109){
                StringBuilder q = new StringBuilder(num);
                q.setCharAt(4, Character.toUpperCase(num.charAt(4)));
                num = q.toString();
                good = true;
            }
            else good = false;
        }
        if(good)
     empNum = num;
        else {
            //System.out.println("Incorrect employee num");
            throw new InvalidEmployeeNumber();
        //System.exit(0);
        }
    }
    public void setName(String name){
    empName = name;
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
    empNum = num;
        else 
            //System.out.println("Incorrect employee num");
            throw new InvalidEmployeeNumber();
    }
    public void setDate(String date){
    hireDate = date;
    }
    public String getName(){
    return empName;
    }
    public String getNum(){
    return empNum;
    }
    public String getDate(){
    return hireDate;
    }
}
