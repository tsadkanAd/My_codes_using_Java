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
public class ParkingMeter {
    private int minute;
    public ParkingMeter(){
    minute = 0;
    }
    public ParkingMeter(int minute){
    this.minute = minute;
    }
    public ParkingMeter(ParkingMeter meter){
    minute = meter.minute;
    }
    public void setMinute(int minute){
    this.minute = minute;
    }
    public int getMinute(){
    return minute;
    }
    public boolean equals(ParkingMeter meter){
    if(meter.minute==minute)
        return true;
    else return false;
    }
    public String toString(){
    return "The number of minutes of parking time that has been purchased is "+minute;
    }
}
