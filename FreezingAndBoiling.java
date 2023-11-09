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
public class FreezingAndBoiling {
    private double temperature;
    FreezingAndBoiling(double t){
    temperature = t;
    }
    public boolean isEthylFreezing(){
        boolean freeze=false;
    if(temperature<=-173)
    freeze= true;
    return freeze;
    }
    public boolean isEthylBoiling(){
    boolean boil = false;
    if(temperature>=172)boil = true;
    return boil;
    }
    public boolean isOxygenFreezing(){
    boolean freeze = false;
    if(temperature<=-362)freeze = true;
    return freeze;
    }
    public boolean isOxygenBoiling(){
        boolean boil = false;
    if(temperature>=-306)boil = true;
    return boil;
    }
    public boolean isWaterFreezing(){
    boolean freeze = false;
    if(temperature<=32)freeze = true;
    return freeze;
    }
    public boolean isWaterBoiling(){
    boolean boil = false;
    if(temperature>=212)boil = true;
    return boil;
    }
}
