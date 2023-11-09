/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.util.ArrayList;
/**
 *
 * @author TA
 */
public class DriverExam {
    private char result[]= {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
    private char userResult[]=new char[20];
    public DriverExam(char []a)
    {
    for(int i = 0; i < 20; i++){
    userResult[i]=a[i];
    }
    }
    public boolean passed(){
        int correct = 0, inCorrect = 0;
        boolean passed;
        for(int  i = 0; i < 20; i++){
        if(result[i]==userResult[i])correct++;
        else inCorrect++;
        }
        if(correct>=15)passed=true;
        else passed = false;
        return passed;
    }
    public int totalCorrect(){
    int correct = 0, inCorrect = 0;
        for(int  i = 0; i < 20; i++){
        if(result[i]==userResult[i])correct++;
        }
        return correct;
    }
    public int totalIncorrect(){
    int correct = 0, inCorrect = 0;
        for(int  i = 0; i < 20; i++){
        if(result[i]==userResult[i])correct++;
        else inCorrect++;
        }
        return inCorrect;
    }
    public ArrayList<Integer> questionMissed(){
        ArrayList<Integer> list=new ArrayList<Integer>();
    int correct = 0, inCorrect = 0;
        boolean passed;
        for(int  i = 0; i < 20; i++){
        if(result[i]==userResult[i])correct++;
        else{
            inCorrect++;
        list.add(i+1);
        } 
        }
        return list;
    }
}
