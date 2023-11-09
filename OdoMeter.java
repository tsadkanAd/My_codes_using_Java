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
public class OdoMeter {
    private double mileage;
    private FuelGauge fuel;
    public OdoMeter(){
    mileage = 0;
    }
    public OdoMeter(double mileage){
    this.mileage = mileage;
    }
    public OdoMeter(OdoMeter meter){
    mileage = meter.mileage;
    }
    public void setMileage(double mileage){
    this.mileage = mileage;
    }
    public double getMileage(){
    return mileage;
    }
    public void incrementMileage(){
        if(mileage>999999)mileage=0;
        else
    mileage++;
    }
    public void reduceFuel(){
    if(mileage>=24)
        for(int i = 24; i <= mileage; i+=24){
        fuel.decrementFuel();
        }
    }
}
