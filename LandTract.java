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
public class LandTract {
    private double length;
    private double width;
    public LandTract(){
    width = 0;
    length = 0;
    }
    public LandTract(double length, double width){
    this.length = length;
    this.width =  width;
    }
    public double calcArea(){
    return length * width;
    }
    public void setLength(double length){
    this.length = length;
    }
    public void setWidth(double width){
    this.width = width;
    }
    public boolean equals(LandTract land){
        boolean equal = false;
        if(land.length==this.length)
            if(land.width==this.width)
                equal = true;
        return equal;
    }
    public String toString(){
    return "The length of the tract is "+length+"\nThe width of the tract is "+width;
    }
}
