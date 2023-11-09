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
public class TeamLeader extends ProductionWorker {
    private double bonus;
    private int reqHours;
    private int hoursAttended;
    public TeamLeader(){
    bonus = 0;
    reqHours = 0;
    hoursAttended = 0;
    }
    public TeamLeader(int shift, int pay, double bonus, int reqHour, int hoursAttend, String name, String num, String date){
    super(shift, pay, date, name, num);
    this.bonus = bonus;
    reqHours = reqHour;
    hoursAttended = hoursAttend;
    }
    public void setBonus(double b){
        bonus = b;
    }
    public double getBonus(){
        return bonus;
    }
    public void setReqHour(int h){
        reqHours = h;
    }
    public int getReqHour(){
        return reqHours;
    }
    public void setHoursAttend(int a){
        hoursAttended = a;
    }
    public int getHoursAttend(){
        return hoursAttended;
    }
    public void display(){
    System.out.println(getName());
    System.out.println(getNum());
    System.out.println(getDate());
    System.out.println(getShift());
    System.out.println(getPayRate());
    System.out.println(getBonus());
    System.out.println(getReqHour());
    System.out.println(getHoursAttend());
    }
}
