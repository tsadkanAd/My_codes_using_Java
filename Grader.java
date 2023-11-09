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
public class Grader {
    private double testScore[];
    Grader(double t[]){
    testScore = new double[t.length];
    for(int i=0; i<t.length; i++)
        testScore[i]=t[i];
    }
   public double getLowestScore(){
       double lowest=testScore[0];
       for(int i = 0; i<testScore.length; i++){
           if(testScore[i]<lowest)
               lowest=testScore[i];
       }
   return lowest;
   } 
   public double getAverage(){
   double total = 0;
   int i=0;
   while(i<testScore.length){
   total += testScore[i];
   i++;
   }
   total -= getLowestScore();
   total/=(testScore.length)-1;
   return total;
   }
}
