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
public class PoliceOfficer {
    private String name;
    private String badgeNum;
    private ParkedCar car;
    private ParkingTicket ticket;
    private ParkingMeter meter;
    public PoliceOfficer(){
    name = "";
    badgeNum = "";
    }
    public PoliceOfficer(String name, String badgeNum, ParkedCar car, ParkingMeter meter){
    this.name = name;
    this.badgeNum = badgeNum;
    this.car = new ParkedCar(car);
    //this.ticket = new ParkingTicket(ticket);
    this.meter = new ParkingMeter(meter);
    }
    public PoliceOfficer(PoliceOfficer police){
    name = police.name;
    badgeNum = police.badgeNum;
    car = new ParkedCar(police.car);
    ticket = new ParkingTicket(police.ticket);
    meter = new ParkingMeter(police.meter);
    }
    public void setTicket(ParkingTicket ticket){
    this.ticket= new ParkingTicket(ticket);
    }
    
    public void setName(String name){
    this.name = name;
    }
    public String getName(){
    return name;
    }
    public void setBadge(String badgeNum){
    this.badgeNum = badgeNum;
    }
    public String getBadge(){
    return badgeNum;
    }
    public int hoursPassed(){
        int pass = car.getMinute()-meter.getMinute();
        if(pass>0)
    return pass;
        else
            return 0;
    }
    public boolean expired(){
    if(car.getMinute()>meter.getMinute())
        return true;
    else return false;
    }
    public void issueTicket(){
    if(expired())
    {
    System.out.println("The car information");
    System.out.println(ticket.getCar().getColor());
    System.out.println(ticket.getCar().getLicense());
    System.out.println(ticket.getCar().getMake());
    System.out.println(ticket.getCar().getMinute());
    System.out.println(ticket.getCar().getModel());
    }
    }
}
