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
public class Employee {
    private String name;
    private String department;
    private String position;
    private int idNumber;
    Employee(String n, String dep, String pos, int id){
name = n;
department = dep;
position = pos;
idNumber = id;
}
    Employee(String n, int id){
        name = n;
department = "";
position = "";
idNumber = id;
    }
    Employee(){
        name = "";
department = "";
position = "";
idNumber = 0;
    }
    public void assignName(String n){
    name = n;
    }
    public void assignDepartment(String d){
    department = d;
    }
    public void assignPosition(String p){
    position = p;
    }
    public void assignId(int id){
    idNumber = id;
    }
    public int getId(){
    return idNumber;
    }
    public String getPosition(){
    return position;
    }
    public String getName(){
    return name;
    }
    public String getDepartment(){
    return department;
    }
}
