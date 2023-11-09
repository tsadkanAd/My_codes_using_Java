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
public class Ship {
    private String shipName;
    private String builtYear;
    public Ship(){
    shipName = "";
    builtYear = "";
    }
    public Ship(String sN, String bY){
    shipName = sN;
    builtYear = bY;
    }
    public void setName(String name){
    shipName = name;
    }
    public String getName(){
    return shipName;
    }
    public void setYear(String year){
    builtYear = year;
    }
    public String getYear(){
    return builtYear;
    }
    public String toString(){
    return "The ship name is "+shipName+"\nThe ship was built in "+builtYear;
    }
}
