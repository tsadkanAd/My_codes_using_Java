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
public class Area {
   public static double calcArea(double r){
   return Math.PI*r*r;
   } 
   public static double calcArea(double length, double width){
   return length*width;
   }
   public static double calcArea(double r, float h){
   return Math.PI*r*r*h;
   }
}
