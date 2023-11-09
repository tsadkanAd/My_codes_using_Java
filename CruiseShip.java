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
public class CruiseShip extends Ship{
    private int maxPassenger;
    public CruiseShip(){
    super();
    maxPassenger = 0;
    }
    public CruiseShip(String sN, String bY, int mP){
    super(sN, bY);
    maxPassenger = mP;
    }
    public void setMax(int mP){
    maxPassenger = mP;
    }
    public int getMax(){
    return maxPassenger;
    }
    public void setName(String name){
    super.setName(name);
    }
    public String getName(){
    return super.getName();
    }
    public void setYear(String year){
    super.setYear(year);
    }
    public String getYear(){
    return super.getYear();
    }
    public String toString(){
    return "The name of the ship is "+getName()+"\nThe maximum number of passengers is "+getMax();
    }
}
