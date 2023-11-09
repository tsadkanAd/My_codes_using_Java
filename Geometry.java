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
public class Geometry {
    
    public static double circleArea(double radius){
    return Math.PI*radius*radius;
    }
    public static double rectangleArea(double length, double width){
        return length*width;
    }
    public static double triangleArea(double base, double height){
    return base*height*0.5;
    }
}
