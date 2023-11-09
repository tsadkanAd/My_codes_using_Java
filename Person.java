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
public class Person {
    private String name;
    private String address;
    private String telephone;
    public Person(){
    name = "";
    address = "";
    telephone = "";
    }
    public Person(String name, String address, String telephone){
    this.name = name;
    this.address = address;
    this.telephone = telephone;
    }
    public Person(Person a){
    name = a.name;
    address = a.address;
    telephone = a.telephone;
    }
    public void setName(String name){
    this.name = name;
    }
    public void setAddress(String address){
    this.address = address;
    }
    public void setTelephone(String telephone){
    this.telephone = telephone;
    }
    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public String getTelephone(){
    return telephone;
    }
    public String toString(){
    return "The name of the customer is "+name+"\nThe address of the customer is "+address+"\nThe "
            + "Telephone number of the customer is "+telephone;
    }
}
