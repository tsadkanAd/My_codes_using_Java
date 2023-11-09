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
public class FuelGauge {
    private int fuel;
    private static int mile = 1;
    public FuelGauge(){
    fuel = 0;
    }
    public FuelGauge(FuelGauge fuel){
        if(fuel.fuel>15){
    this.fuel = 15;
        System.out.println("The car can hold a maximum of 15 gallon");
        }
        else 
            this.fuel = fuel.fuel;
    }
    public FuelGauge(int fuel){
        if(fuel>15){
    this.fuel = 15;
        System.out.println("The car can hold a maximum of 15 gallon");
        }
        else
            this.fuel = fuel;
    }
    public void setFuel(int fuel){
        if(fuel>15){
    this.fuel = 15;
        System.out.println("The car can hold a maximum of 15 gallon");
        }
        else 
            this.fuel = fuel;
    }
    public int getFuel(){
    return fuel;
    }
    public void incrementFuel(){
        if(fuel<15)
    fuel++;
    }
    public void incrementFuel(int fuel){
        if(fuel<15)
    this.fuel+=fuel;
    }
    public void decrementFuel(){
        if(fuel>0)
    fuel--;
    }
    public void reduceFuel(OdoMeter mileage){
    if(mileage.getMileage()>=(24*mile)){
        for(int i = 24*mile; i <= mileage.getMileage(); i+=24){
        decrementFuel();
        }
        mile++;
    }
    }
}
