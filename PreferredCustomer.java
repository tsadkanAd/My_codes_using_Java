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
public class PreferredCustomer extends Customer{
    private double purchase;
    private double discount;
    public PreferredCustomer(){
    purchase = 0;
    discount = 0;
    }
    public PreferredCustomer(double purchase, String num, String name, String address, String telephone, boolean mail){
    super(num, mail, name, address, telephone);
    this.purchase = purchase;
    setDiscount();
    //this.discount = discount;
    }
    public PreferredCustomer(PreferredCustomer a){
    super(a.getCustNum(), a.getMail(), a.getName(), a.getAddress(), a.getTelephone());
    purchase = a.purchase;
    setDiscount();
    //discount = a.discount;
    }
    public void setPurchase(double purchase){
    this.purchase = purchase;
    }
    public double getPurchase(){
    return purchase;
    }
    public void setDiscount(){
    if(purchase>=500&&purchase<1000)discount = 0.05;
    else if(purchase>=1000&&purchase<1500)discount = 0.06;
    else if(purchase>=1500&&purchase<2000)discount = 0.07;
    else if(purchase >= 2000)discount = 0.1;
    else discount = 0;
    }
    public boolean equals(PreferredCustomer a){
        boolean equal = false;
    if(a.getName().equalsIgnoreCase(this.getName()))
        if(a.getAddress().equalsIgnoreCase(this.getAddress()))
            if(a.getTelephone().equalsIgnoreCase(getTelephone()))
                if(a.getCustNum().equalsIgnoreCase(getCustNum()))
                    if(a.getMail()==this.getMail())
                        if(a.purchase==purchase)
                            if(a.discount == discount)
                                equal = true;
    else
                                equal = false;
       return equal;                   
    }
    public double calcTotal(){
    return purchase * discount;
    }
    public String toString(){
    String all = "";
    all += "Name: "+getName()+"\nAddress: "+getAddress()+"\nTelephone: "+getTelephone()+"\nCustomer number: "+getCustNum()+"\nPurchase: "+purchase+""+ "\nDiscount: "+discount;
    all += "\nTotal: "+Math.round(calcTotal());
    if(getMail()== true)
        all += "\nThe customer wishes to be in the mailing list";
    else
        all += "\nThe customer doesn't wish to be in the mailing list";
    return all;
    }
}
