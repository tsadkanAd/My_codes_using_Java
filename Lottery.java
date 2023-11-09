/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.util.*;
/**
 *
 * @author TA
 */
public class Lottery {
    private int[]lotteryNumbers = new int[5];
    public Lottery(){
    Random rand = new Random();
    for(int i = 0; i < 5; i++){
    lotteryNumbers[i]=rand.nextInt(10);
    }
    }
    public int personPick(int[]person){
        int theSame = 0;
    for(int i = 0; i < 5; i++){
        if(person[i]==lotteryNumbers[i])theSame++;
    }
    return theSame;
    }
    public void theLottery(){
    for(int i = 0; i<5; i++){
    System.out.print(lotteryNumbers[i]+"\t");
    }
    }        
}
