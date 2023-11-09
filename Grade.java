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
public class Grade {
    private String names[] = new String[5];
    private char grade[] = new char[5];
    private double testScore[][] = new double[5][4];
    public String getName(int i){
    return names[i];
    }
    public Grade(String name[], double score[][]){
    for(int i = 0; i<5; i++){
    names[i]=name[i];
    }
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 4; j++){
        testScore[i][j]=score[i][j];
        }
    }
    }
    public double averageScore(int j){
        double total = 0, average;
    for(int i = 0; i<=3; i++){
    total += testScore[j][i];
    }
    double min = testScore[j][0];
    for(int i = 0; i <= 3; i++){
        if(testScore[j][i]<min)min=testScore[j][i];
    }
    total-=min;
    average=total/3;
    return average;
    }
    public char letterGrade(int j){
        if(averageScore(j)>=90){
        grade[j] = 'A';
        }
        else if(averageScore(j)>=80){
        grade[j] = 'B';
        }
        else if(averageScore(j)>=70){
        grade[j] = 'C';
        }
        else if(averageScore(j)>=60){
        grade[j] = 'D';
        }
        else grade[j] = 'F';
    return grade[j];
    }
}
