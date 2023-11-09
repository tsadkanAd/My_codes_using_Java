/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.util.Random;
/**
 *
 * @author TA
 */
public class Coin {
    private String sideUp;
    Coin(){
        int num;
    Random rand = new Random();
    num = rand.nextInt(2);
    if(num==0){
    sideUp = "Tail";
    }
    else sideUp = "Head";
    }
    public void toss(){
    int num;
    Random rand = new Random();
    num = rand.nextInt(2);
    if(num==0){
    sideUp = "Tail";
    }
    else sideUp = "Head";
    }
    public String getSideUp(){
    return sideUp;
    }
    }

