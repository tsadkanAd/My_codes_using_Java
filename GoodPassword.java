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
public class GoodPassword {
   private String password;
   public GoodPassword(){
   password = "";
   }
   public GoodPassword(String text){
   password = text;
   }
   public boolean isBest(){
       int upper = 0, lower = 0, num = 0;
       boolean best = true;
       if(password.length()<6)best = false;
       for(int i = 0; i < password.length(); i++){
           if(Character.isUpperCase(password.charAt(i)))upper++;
           else if(Character.isLowerCase(password.charAt(i)))lower++;
           else if(Character.isDigit(password.charAt(i)))num++;
       }
       if(upper<1)best = false;
       else if(lower<1)best = false;
       else if(num<1)best = false;
       return best;
   }
}
