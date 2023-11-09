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
public class RoomCarpet {
    private RoomDimension room;
    private double cost;
    public RoomCarpet(double cost){
    this.cost = cost;
    }
    public RoomCarpet(RoomDimension room){
    this.room=new RoomDimension(room);
    }
    public RoomCarpet(){
    room = new RoomDimension();
    }
    public void setCost(double c){
    cost = c;
    }
    public double getCost(){
    return cost;
    }
    public void setRoom(RoomDimension room){
    this.room = new RoomDimension(room);
    }
    public RoomDimension getRoom(){
    return new RoomDimension(room);
    }
    public double calcTotal(){
    return cost*room.calcArea();
    }
}
