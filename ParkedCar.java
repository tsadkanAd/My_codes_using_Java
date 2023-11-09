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
public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNum;
    private int minute;
    public ParkedCar(){
    make = "";
    color = "";
    licenseNum = "";
    minute = 0;
    }
    public ParkedCar(String make, String model, String color, String licenseNum, int minute){
    this.make = make;
    this.model = model;
    this.licenseNum = licenseNum;
    this.color = color;
    this.minute = minute;
    }
    public ParkedCar(ParkedCar car){
    make = car.make;
    model = car.model;
    licenseNum = car.licenseNum;
    color = car.color;
    minute = car.minute;
    }
    public void setMake(String make){
    this.make = make;
    }
    public String getMake(){
    return make;
    }
    public void setModel(String model){
    this.model = model;
    }
    public String getModel(){
    return model;
    }
    public void setColor(String color){
    this.color = color;
    }
    public String getColor(){
    return color;
    }
    public void setLicense(String licenseNum){
    this.licenseNum = licenseNum;
    }
    public String getLicense(){
    return licenseNum;
    }
    public void setMinute(int minute){
    this.minute = minute;
    }
    public int getMinute(){
    return minute;
    }
    public boolean equals(ParkedCar car){
    if(car.make.equalsIgnoreCase(make)&&car.model.equalsIgnoreCase(model)&&car.color.equalsIgnoreCase(color)&&car.licenseNum.equalsIgnoreCase(licenseNum)&&car.minute==minute)
        return true;
    else return false;
    }
    public String toString(){
    String make1 = "The make of the car is "+make;
    String model1 = "The model of the car is "+model;
    String color1 = "The color of the car is "+color;
    String license = "The license number of the car is "+licenseNum;
    String minute1 = "The number of minutes the car has been parked is "+minute;
    return make1+"\n"+model1+"\n"+color1+"\n"+license+"\n"+minute1;
    }
}
