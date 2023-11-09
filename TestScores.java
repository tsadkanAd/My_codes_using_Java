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
public class TestScores {
    private double test1;
    private double test2;
    private double test3;
    TestScores(double t1, double t2, double t3){
    test1 = t1;
    test2 = t2;
    test3 = t3;
    }
    TestScores(){
     test1 = 0;
    test2 = 0;
    test3 = 0;
    }
    public void setTest1(double t1){
    test1 = t1;
    }
    public void setTest2(double t2){
    test2 = t2;
    }
    public void setTest3(double t3){
    test3 = t3;
    }
    public double getTest1(){
        return test1;
    }
    public double getTest2(){
        return test2;
    }
    public double getTest3(){
        return test3;
    }
    public double calcAverage(){
        return (test3+test2+test1)/3;
    }
}
