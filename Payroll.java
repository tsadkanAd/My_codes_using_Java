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
public class Payroll {
    private String employeeName;
    private String idNumber;
    private double payRate;
    private float numHour;
    Payroll(String e, String i)throws IncorrectName, IncorrectId{
        if(e.isEmpty())
            throw new IncorrectName();
    employeeName = e;
    if(i.isEmpty())
        throw new IncorrectId();
    idNumber = i;
    }
    Payroll(){
    employeeName = "";
    idNumber = "";
    payRate = 0;
    numHour = 0;
    }
    public void setName(String n)throws IncorrectName{
         if(n.isEmpty())
            throw new IncorrectName();
    employeeName = n;
    }
    public void setId(String i)throws IncorrectId{
        if(i.isEmpty())
        throw new IncorrectId();
    idNumber = i;
    }
    public void setPayRate(double p)throws IncorrectRate{
        if(p<0||p>25)
            throw new IncorrectRate();
    payRate = p;
    }
    public void setNumHours(float h)throws IncorrectHour{
        if(h<0||h>84)
            throw new IncorrectHour();
    numHour = h;
    }
    public String getName(){
        return employeeName;
    }
    public String getId(){
        return idNumber;
    }
    public double getPayRate(){
        return payRate;
    }
    public float getNumHours(){
    return numHour;
    }
    public double calcGrossPay(){
    return numHour * payRate;
    }
}
