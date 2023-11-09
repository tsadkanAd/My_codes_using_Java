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
public class Essay extends GradedActivity{
    private int grammar;
    private int spelling;
    private int correctLength;
    private int content;
    public Essay(){
    grammar = 0;
    spelling = 0;
    correctLength = 0;
    content = 0;
    }
    public Essay(int g, int s, int co, int c){
        if(g>30||s>20||co>20||c>30){
            if(g>30)
            System.out.println("Incorrect grammar result");
        if(s>20)
        System.out.println("Incorrect spelling result");
        if(co>20)
        System.out.println("Incorrect correct length result");
        if(c>30)
        System.out.println("Incorrect content result");
        System.exit(0);
        }
        else{
    grammar = g;
    spelling = s;
    correctLength = co;
    content = c;
            int total = grammar + spelling + correctLength + content;
    setScore(total);
        }
    }
    public void setGrammar(int g){
        if(g<31)
    grammar = g;
        else System.out.println("Incorrect grammar result");
    }
    public int getGrammar(){
        return grammar;
    }
    public void setSpelling(int s){
        if(s>20)System.out.println("Incorrect spelling result");
        else spelling = s;
    }
    public int getSpelling(){
        return spelling;
    }
    public void setCorrectLength(int c){
        if(c<21)
    correctLength = c;
        else System.out.println("Incorrect correct length result");
    }
    public int getCorrectLength(){
        return correctLength;
    }
    public void setContent(int c){
        if(c>31)
    content = c;
        System.out.println("Incorrect content result");
    }
    public int getContent(){
        return content;
    }
    public char calcTotal(){
    int total = grammar + spelling + correctLength + content;
    setScore(total);
    return getGrade();
    }
}
