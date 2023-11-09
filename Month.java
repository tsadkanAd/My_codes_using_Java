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
public class Month {
    private int monthNumber;
    public Month(){
    monthNumber = 1;
    }
    public Month(int monthNumber)throws IncorrectMonthNumber{
        if(monthNumber>12||monthNumber<1){
            this.monthNumber = 1;
        throw new IncorrectMonthNumber();
        }
        else
            this.monthNumber = monthNumber;
    }
    public Month(String monthName)throws IncorrectMonthName{
        switch(monthName.toLowerCase()){
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 1;
                throw new IncorrectMonthName();
        }
    }
    public void setMonthNumber(int monthNumber)throws IncorrectMonthNumber{
        if(monthNumber>12||monthNumber<1){
            this.monthNumber = 1;
            throw new IncorrectMonthNumber();
        }
        else
             this.monthNumber = monthNumber;
    }
    public int getMonthNumber(){
    return monthNumber;
    }
    public String getMonthName(){
        String monthName="";
        switch(monthNumber){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }
    public String toString(){
    return "The name fo the month is "+getMonthName();
    }
    public boolean equals(Month month){
        if(this.monthNumber == month.monthNumber)
            return true;
        else return false;
    }
    public boolean greaterThan(Month month){
        if(this.monthNumber > month.monthNumber)
            return true;
        else return false;
    }
    public boolean lessThan(Month month){
        if(this.monthNumber < month.monthNumber)
            return true;
        else return false;
    }
}
