/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
package run;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author TA
 *//*
public class Analysis {
    private int num[] = new int[10];
    public Analysis(String fileName)throws IOException{
    File file = new File(fileName);
    if(file.exists()){
    Scanner input = new Scanner(file);
    int i = 0;
    while(input.hasNext()){
        num[i] = input.nextInt();
    i++;
    }
    }
    }
    public int getLowest(){
    int min = num[0];
    for(int j = 0; j < 10; j++){
        if(num[j]<min)min=num[j];
    }
    return min;
    }
    public int getHighest(){
    int max = num[0];
    for(int j = 0; j < 10; j++){
        if(num[j]>max)max=num[j];
    }
    return max;
    }
    public int getTotal(){
    int sum = 0;
    for(int i = 0; i < 10; i++){
    sum+=num[i];
    }
    return sum;
    }
    public double getAverage(){
    return (double)getTotal()/10;
    }
}*/
public class Librarian extends Person{
    private double salary;
    private String libId;
    private String doe; // date of employement 
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setId(String id){
        libId = id;
    }
    public double getSalary(){
        return salary;
    }
    public String getId(){
        return libId;
    }
    public void setDoe(String doe){
        this.doe = doe;
    }
    public String getDoe(){
        return doe;
    }
}