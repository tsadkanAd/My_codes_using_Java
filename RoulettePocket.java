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
public class RoulettePocket {
    private int pocketN;
    RoulettePocket(int p){
    pocketN = p;
    }
    public String getPocketColor(){
        String color="";
    if(pocketN==0)color="Green";
    else if(pocketN>=1&&pocketN<=10){
        if(pocketN%2==0)color="Black";
        else color="Red";
    }
    else if(pocketN>=11&&pocketN<=18){
        if(pocketN%2==0)color="Red";
        else color="Black";
    }
    else if(pocketN>=19&&pocketN<=28){
        if(pocketN%2==0)color="Black";
        else color="Red";
    }
    else if(pocketN>=29&&pocketN<=36){
        if(pocketN%2==0)color="Red";
        else color="Black";
    }
    else 
        return "Unknown please use known pocket number";
    return color;
    }
}
