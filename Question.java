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
public class Question {
    private String question;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private String numAns;
    public Question(){}
    public Question(String quest, String ans1, String ans2, String ans3, String ans4, String numAns){
    question = quest;
    this.ans1 = ans1;
    this.ans2 = ans2;
    this.ans3 = ans3;
    this.ans4 = ans4;
    this.numAns = numAns;
    }
    public void setQuestion(String quest){
    question = quest;
    }
    public String getQuestion(){
    return question;
    }
    public void setChoice(String ans1, String ans2, String ans3, String ans4){
    this.ans1 = ans1;
    this.ans2 = ans2;
    this.ans3 = ans3;
    this.ans4 = ans4;
    }
    public void getChoice(){
    System.out.println("1. "+ans1+"\n2. "+ans2+"\n3. "+ans3+"\n4. "+ans4);
    }
    public void setAnswer(String ans){
    numAns = ans;
    }
    public String getAnswer(){
    return numAns;
    }
    public boolean equals(Question a){
        boolean status = false;
        if(this.question.equalsIgnoreCase(a.question))status = true;
        return status;
    }
}
