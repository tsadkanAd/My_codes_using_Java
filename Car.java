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
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    Car(int y, String m){
        yearModel = y;
        make = m;
        speed = 0;
}
    public int getYear(){
    return yearModel;
    }
    public int getSpeed(){
    return speed;
    }
    public String getMake(){
        return make;
    }
    public void accelerate(){
    speed+=5;
    }
    public void brake(){
    speed-=5;
    }
}
