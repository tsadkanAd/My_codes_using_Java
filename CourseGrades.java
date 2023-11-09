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
public class CourseGrades implements Analyzable {
    private GradedActivity [] grades = new GradedActivity[4];
    public void setLab(GradedActivity lab){
        if(lab.getScore()>0)
        grades[0] = lab;
        else
            System.out.println("The lab score should be greater than zero");
    }
    public void setPassFailExam(PassFailExam pass){
        if(pass.getScore() > 0)
            grades[1] = pass;
        else 
            System.out.println("The pass fail score should be greater than zero");
    }
    public void setEssay(Essay test){
        if(test.getScore() > 0)
            grades[2] = test;
        else 
            System.out.println("The essay score should be greater than zero");
    }
    public void setFinalExam(FinalExam exam){
        if(exam.getScore() > 0)
            grades[3] = exam;
        else 
            System.out.println("The final exam score should be greater than zero");
    }
    public String toString(){
        String all = "";
        all += "SCORE\t\t\tGRADE\n";
        for(int i = 0; i < 4; i++){
            all += grades[i].getScore()+"\t\t\t"+grades[i].getGrade();
            if(i<3)all += "\n";
        }
        return all;
    }
    public double getAverage(){
        double total = 0, average;
    for(int i = 0; i < 4; i++){
        total += grades[i].getScore();}
        return total/grades.length;
    }
    public GradedActivity getHighest(){
    double high = grades[0].getScore();
    GradedActivity a = grades[0];
    for(int i = 1; i < 4; i++){
        if(grades[i].getScore()>high){
            high = grades[i].getScore();
            a = grades[i];
        }
    }
    return a;
    }
    public GradedActivity getLowest(){
    double lowest = grades[0].getScore();
    GradedActivity a = grades[0];
    for(int i = 1; i < 4; i++){
        if(grades[i].getScore() < lowest){
        lowest = grades[i].getScore();
        a = grades[i];
        }
    }
    return a;
    }
}
