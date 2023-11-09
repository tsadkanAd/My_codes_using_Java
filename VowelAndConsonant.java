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
public class VowelAndConsonant {
    private int vowels;
    private int consonant;
    private String line;
    public VowelAndConsonant(){
    vowels = 0;
        consonant = 0;
        line = "";
    }
    public VowelAndConsonant(String text){
        vowels = 0;
        consonant = 0;
        line = text;
   int i = 0; 
    while(i<line.length()){
        if(Character.toLowerCase(line.charAt(i))=='a'||Character.toLowerCase(line.charAt(i))=='e'||Character.toLowerCase(line.charAt(i))=='i'||Character.toLowerCase(line.charAt(i))=='o'||Character.toLowerCase(line.charAt(i))=='u')
            vowels++;
        else consonant++;
        i++;
    }
    }
    public int getVowels(){
    return vowels;
    }
    public int getConsonant(){
    return consonant;
    }
}
