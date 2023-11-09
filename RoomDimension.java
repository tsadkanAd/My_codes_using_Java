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
public class RoomDimension {
    private double length;
    private double width;
    public RoomDimension(){
    length = 0;
    width = 0;
    }
    public RoomDimension(double length, double width){
    this.length = length;
    this.width = width;
    }
    public RoomDimension(RoomDimension room){
    length = room.length;
    width = room.width;
    }
    public void setLength(double l){
    length = l;
    }
    public double getLength(){
    return length;
    }
    public void setWidth(double w){
    width = w;
    }
    public double getWidth(){
    return width;
    }
    public double calcArea(){
    return length * width;
    }
}
