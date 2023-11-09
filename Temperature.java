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
public class Temperature {
    private double ftemp;
    Temperature(double f){
    ftemp = f;
    }
    public void setFahrenheit(double f){
    ftemp = f;
    }
    public double getFahrenheit(){
    return ftemp;
    }
    public double getCelsius(){
    double celsius = ((double)(5)/9)*(ftemp-32);
    return celsius;
    }
    public double getKelvin(){
    double kelvin = ((double)(5)/9)*(ftemp-32)+273;
    return kelvin;
    }
}
