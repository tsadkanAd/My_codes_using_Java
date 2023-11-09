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
public class PassFailActivity extends GradedActivity{
    private double minPassingScore;
    public PassFailActivity(){
    minPassingScore = 0;
    }
    public PassFailActivity(double mps){
    minPassingScore = mps;
    }
    public char getGrade(){
    char letterGrade;
    if(super.getScore() >= minPassingScore)
        letterGrade = 'P';
    else letterGrade = 'F';
    return letterGrade;
    }
}
