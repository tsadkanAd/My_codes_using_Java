/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.util.Scanner;
/**
 *
 * @author TA
 */
public class Player1 {
    private int guess;   //It may be one or zero
    private int point;
    public Player1(){
        point = 0;
    }
    public void guess(){
        Scanner keyboard = new Scanner(System.in);
    Coin one = new Coin();
    one.toss();
    String type = one.getSideUp();
    System.out.println("Enter your guess(1/0)");
    guess = keyboard.nextInt();
    while(guess!=0&&guess!=1){
    System.out.println("Enter your guess again(1/0)");
    guess = keyboard.nextInt();
    }
    if(type.equalsIgnoreCase("head")&& guess == 1)
        point++;
    else if(type.equalsIgnoreCase("tail")&& guess == 0)
        point++;
    else point--;
    }
    public int getGuess(){
    return guess;
    }
    public int getPoint() {
        return point;
    }
    
}
