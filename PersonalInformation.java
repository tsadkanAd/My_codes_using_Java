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
public class PersonalInformation {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    public void setName(String n){
    name = n;
    }
    public void setAddress(String a){
    address = a;
    }
    public void setAge(int a){
    age = a;
    }
    public void setPhone(String p){
    phoneNumber = p;
    }
    public int getAge(){
    return age;
    }
    public String getAddress(){
    return address;
    }
    public String getName(){
    return name;
    }
    public String getPhone(){
    return phoneNumber;
    }
}
