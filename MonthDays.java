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
public class MonthDays {
    private int month;
    private int year;
    MonthDays(int m, int y){
    month = m;
    year = y;
    }
    public boolean leapYear(){
        boolean leap=false;
    if(year%100==0){
        if(year%400==0)leap=true;
    }
    else if(year % 4==0)leap = true;
    return leap;
    }
    public int getNumberOfDays(){
        int days;
    if(month==4||month==6||month==9||month==11)days = 30;
    else if(month==2){
        if(leapYear())days = 29;
        else days = 28;
    }
    else days = 31;
    return days;
    }
}
