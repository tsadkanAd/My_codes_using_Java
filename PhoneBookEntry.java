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
public class PhoneBookEntry {
    private String name;
    private String phone;
    public PhoneBookEntry(){
  
    }
    public PhoneBookEntry(String name, String phone){
    this.name=name;
    this.phone=phone;
    }
    public void setName(String nam){
    name = nam;
    }
    public void setPhone(String phon){
    phone = phon;
    }
    public String getName(){
    return name;
    }
    public String getPhone(){
    return phone;
    }
}
