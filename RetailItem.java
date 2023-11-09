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
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    RetailItem(String d, int u, double p){
    description = d;
    unitsOnHand = u;
    price = p;
    }
    RetailItem(){
    description = "";
    unitsOnHand = 0;
    price = 0;
    }
    public RetailItem(RetailItem a)throws InvalidPrice, InvalidUnitsOnHand{
        if(a.price<0)
            throw new InvalidPrice();
        if(a.unitsOnHand<0)
            throw new InvalidUnitsOnHand();
    description = a.description;
    unitsOnHand = a.unitsOnHand;
    price = a.price;
    }
    public void setDescription(String d){
    description = d;
    }
    public void setUnits(int u)throws InvalidUnitsOnHand{
        if(u<0)
            throw new InvalidUnitsOnHand();
     unitsOnHand = u;   
    }
    public void setPrice(double p)throws InvalidPrice{
        if(p<0)
            throw new InvalidPrice();
    price = p;
    }
    public String getDescription(){
    return description;
    }
    public int getUnits(){
    return unitsOnHand;
    }
    public double getPrice(){
    return price;
    }
}
