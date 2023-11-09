/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author TA
 */
public class ChargeAccount {
     private ArrayList<Integer> list = new ArrayList<>();
     public ChargeAccount()throws IOException{
     setCharge();
     }
     public int getCharge(){
     return list.get(12);
     }
     private void setCharge()throws IOException{
         File file = new File("chargeaccount.txt");
         Scanner keyboard = new Scanner(file);
         for(int i = 0; i<18; i++){
         list.add(i,keyboard.nextInt());
         }
     /*list.add(5658845);
     list.add(4020125);
     list.add(7895122);
     list.add(8777541);
     list.add(8451277);
     list.add(1302850);
     list.add(8080152);
     list.add(4562555);
     list.add(5552012);
     list.add(5050552);
     list.add(7825877);
     list.add(1250255);
     list.add(1005231);
     list.add(6545231);
     list.add(3852085);
     list.add(7576651);
     list.add(7881200);
     list.add(4581002);*/
     }
     public boolean checkAccount(int a){
         boolean found = false;
     for(int i = 0; i<list.size(); i++){
         if(a==list.get(i)){
         found = true;
         }
     }
     return found;
     }
         
}
