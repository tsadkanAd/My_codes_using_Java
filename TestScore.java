/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.io.*;
/**
 *
 * @author TA
 */
public class TestScore implements Serializable{
    private double scores[];
    public TestScore(double []a)throws InvalidTestScore{
        for(int i = 0; i < a.length; i++){
            if(a[i]<0||a[i]>100)
                throw new InvalidTestScore();
        }
        scores = a;
    }
    public TestScore(){
    }
    public double calcAverage(){
        double total = 0;
        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        return total/scores.length;
    }
}


