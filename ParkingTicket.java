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
public class ParkingTicket {
   private ParkedCar car;
   private PoliceOfficer traffic;
   public ParkingTicket(){
       traffic = null;
       car = null;
    /*car = new ParkedCar();
   car.setMake("");
   car.setModel("");
   car.setColor("");
   car.setLicense("");
   car.setMinute(0);*/
   }
   public ParkingTicket(ParkingTicket ticket){
       //car = null;
   car = new ParkedCar(ticket.car);
   //traffic = new PoliceOfficer();
   }
   public ParkingTicket(ParkedCar car, PoliceOfficer traffic){
   car = new ParkedCar(car);
   this.traffic = new PoliceOfficer(traffic);
   }
   public ParkingTicket(ParkedCar car){
   this.car = new ParkedCar(car);
   traffic = new PoliceOfficer();
   }
   public ParkingTicket(PoliceOfficer police){
       //car = new ParkedCar();
   traffic = new PoliceOfficer(police);
   }
   public ParkingTicket(ParkingTicket ticket, PoliceOfficer traffic){
   car = new ParkedCar(ticket.car);
   this.traffic = new PoliceOfficer(traffic);
   }
   //public void setCar(ParkedCar car){
   //this.car = new ParkedCar(car);
   //}
   public void setPolice(PoliceOfficer police){
   this.traffic = police;
   }
   public ParkedCar getCar(){
   return new ParkedCar(car);
   }
   public String getPolice(){
   return "The name of the police officer is "+traffic.getName()+"\nThe badge number of the police officer is "+traffic.getBadge();
   }
   public String reportFine(){
   final double fine = 25;
   int i = 0;
   double total = 0;
   boolean done = false;
   int hour = traffic.hoursPassed();
   
   while(!done){
       if(hour>=1)
       if(hour==traffic.hoursPassed()){
       hour--;
   total+=fine;
       }
       if(hour>0){
           total+=10;
           hour--;
       }
       else done = true;
   }
   if(total>0)
   return "The amount of the fine is "+total;
   else
       return "You are free";
   }
}
