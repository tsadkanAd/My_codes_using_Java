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
public class Player {
    private int point = 50;
    public Player(){
    Die a = new Die(50);
    point-=a.getValue();
    if((point-=a.getValue())<1)point+=(a.getValue()*2);
    }
    public int getPoint(){
    return point;
    }
    public boolean veryClose(Player two){
        boolean close = false;
        int sub = point-1;
        if(sub<0)sub=-sub;
        int Two = two.getPoint()-1;
        if(Two<0)Two=-Two;
        if(sub<Two&&Two!=1)close = true;
        else if(sub==Two)close = false;
        else close = false;
        return close;
        }
}
