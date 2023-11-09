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
public class Payrol {
    private final int employeeId[]={5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    private int hour[];
    private double payRate[];
    private double wages[];
    public Payrol(){
    hour=new int[7];
    payRate=new double [7];
    wages=new double[7];
    }
    public void setHour(int h, int i){
    hour[i]=h;
    }
    public void setRate(double r, int i){
    payRate[i]=r;
    }
    public int getHour(int i){
    return hour[i];
    }
    public double getRate(int i){
    return payRate[i];
    }
    public int getId(int i){
    return employeeId[i];
    }
    public double getWages(int i){
        wages[i]=calcGross(employeeId[i]);
    return wages[i];
    }
    public double calcGross(int id){
        int index=-1;
    for(int i =0; i<7; i++){
        if(id==employeeId[i]){
        index=i;
        }
    }
    wages[index]=hour[index]*payRate[index];
    return wages[index];
    }
}
