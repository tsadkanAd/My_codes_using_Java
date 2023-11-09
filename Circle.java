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
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    Circle(double r){
    radius = r;
    }
    Circle(){
    radius = 0;
    }
    public void setRadius(double r){
    radius = r;
    }
    public double getRadius(){
    return radius;
    }
    public double getArea(){
    double area = PI * radius * radius;
    return area;
    }
    public double getDiameter(){
    double diameter = radius * 2;
    return diameter;
    }
    public double getCircumference(){
    double circumference = 2 * PI * radius;
    return circumference;
    }
}
