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
public class Customer extends Person{
    private String custNum;
    private boolean onMailingList;
    public Customer(){
    custNum = "";
    onMailingList = false;
    }
    public Customer(String cust, boolean mail, String name, String address, String telephone){
    custNum = cust;
    onMailingList = mail;
    setName(name);
    setAddress(address);
    setTelephone(telephone);
    }
    public Customer(Customer a){
    setName(a.getName());
    setAddress(a.getAddress());
    setTelephone(a.getTelephone());
    custNum = a.custNum;
    onMailingList = a.onMailingList;
    }
    public void setCustNum(String num){
    custNum = num;
    }
    public void setMail(boolean a){
    onMailingList = a;
    }
    public String getCustNum(){
    return custNum;
    }
    public boolean getMail(){
    return onMailingList;
    }
    public String toString(){
        String need;
        if(onMailingList)need = "wishes to be in the mailing list";
        else need = "doesn't wish to be in the mailing list";
    return super.toString()+"\nThe customer number is "+custNum+"\nThe customer "+need;
    }
}
