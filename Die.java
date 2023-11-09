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
public class Die {
    private int sides;
    private int value;
    public Die(int numSides){
    sides = numSides;
    roll();
    }
    public void roll(){
    Random rand = new Random();
    value = rand.nextInt(sides)+1;
    }
    public int getSides(){
    return sides;
    }
    public int getValue(){
    return value;
    }
}
