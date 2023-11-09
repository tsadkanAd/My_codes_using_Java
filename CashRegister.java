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
public class CashRegister {
    private RetailItem thing;
    private int quantity;
    public CashRegister(RetailItem a , int item)throws InvalidPrice, InvalidUnitsOnHand{
    thing = new RetailItem(a);
    quantity = item;
    }
    public double getSubTotal(){
    return quantity * thing.getPrice();
    }
    public double getTax(){
    return getSubTotal()*0.06;
    }
    public double getTotal(){
    return getSubTotal()+getTax();
    }
}
