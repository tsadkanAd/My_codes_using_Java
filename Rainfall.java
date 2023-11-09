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
public class Rainfall {
    private double rainFall[];
    public double totalRain(){
        double total = 0;
    for(int i = 0; i < 12; i++){
    total+=rainFall[i];
    }
    return total;
    }
    public void setRain(double r[]){
        rainFall=new double[12];
    for(int i = 0; i<12; i++){
    rainFall[i]=r[i];
    }
    }
    public double monthlyRain(){
        double total = 0;
    for(int i = 0; i < 12; i++){
    total+=rainFall[i];
    }
    return total/12;
    }
    public int mostRain(){
    double most = rainFall[0];
    int index=-1;
    for(int i = 0; i<12; i++){
    if(rainFall[i]>most){
        most=rainFall[i];
        index=i;
    }
    }
    return index;
    }
    public int leastRain(){
    double least=rainFall[0];
    int index = 0;
    for(int i = 1; i<12; i++){
    if(rainFall[i]<least){
    least = rainFall[i];
    index = i;
    }
    }
    return index;
    }
}
