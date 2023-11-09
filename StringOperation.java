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
public class StringOperation {
    public static int wordCount(String a){
            int word = 0;
           int i = 0;
           if(Character.isLetter(a.charAt(0)))
               word=1;
        while(i<a.length()-1){
         if(!Character.isLetterOrDigit(a.charAt(i))&& Character.isLetter(a.charAt(i+1)))
         word++;
         i++;
        }
        return word;
        }
    public static String arrayToString(char [] array){
    String str = String.valueOf(array);
    return str;
    }
    public static char mostFrequent(String str){
        int count[] = new int [str.length()];
        int high = count[0], low = count[0];
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            char character = ' ';
            
            character = str.charAt(i);
            for(int j = i+1; j <str.length(); j++){
                if(Character.toLowerCase(character)==Character.toLowerCase(str.charAt(j))){
                    if(!Character.isWhitespace(str.charAt(i)))
                    count[i]++;
                }
            }
            for(int k = 0; k < str.length(); k++){
                if(count[k]>high){high=count[k];index = k;}
            }
        }
        if(index!=-1)
        return str.charAt(index);
        else return ' ';
    }
    public static String replaceSubstring(String str1, String str2, String str3){
        String collect[] = str1.split(" ");
           for(int i = 0; i < collect.length; i++){
               if(str2.equalsIgnoreCase(collect[i]))
                   collect[i]=str3;
           }
           String building = "";
           for(int d = 0; d < collect.length; d++){
               building+=collect[d];
               building+=" ";
           }
        return building;    
    }
}
