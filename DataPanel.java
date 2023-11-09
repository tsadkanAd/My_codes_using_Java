/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author TA
 */
public class DataPanel extends JPanel{
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    private JTextField t1,t2,t3, t4, t5, t6, t7, t8;
    public DataPanel(){
    l1 = new JLabel("Number of days on the trip");
    l1.setForeground(Color.red);
    l2 = new JLabel("Amount of airfare");
    l3 = new JLabel("Amount of car rental fees");
    l4 = new JLabel("Number of mile driven");
    l5 = new JLabel("Amount of parking fees");
    l6 = new JLabel("Amount of taxi charges");
    l7 = new JLabel("Conference or seminar registration fees");
    l8 = new JLabel("Lodging charges");
    l8.setForeground(Color.red);
    t1 = new JTextField(10);
    t2 = new JTextField(10);
    t3 = new JTextField(10);
    t4 = new JTextField(10);
    t5 = new JTextField(10);
    t6 = new JTextField(10);
    t7 = new JTextField(10);
    t8 = new JTextField(10);
    setLayout(new GridLayout(4,1));
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);add(t3);
    add(l4);add(t4);
    add(l5);add(t5);
    add(l6);add(t6);
    add(l7);add(t7);
    add(l8);add(t8);
    }
    public double getTotal(){
        double total = 0, airFare, rent,miles, parkingFee, taxiFee, otherFee;
        int trip = Integer.parseInt(t1.getText());
        if(t1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The number of days should be filled");
        }
        double lodgingCharge;
        if(t8.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The lodging charge should be filled");
        }
        else {
            lodgingCharge = Double.parseDouble(t8.getText());
            total += lodgingCharge;
        }
        if(t2.getText().isEmpty()){
        airFare = 0;
        }
        else {
            airFare = Double.parseDouble(t2.getText());
            total += airFare;
        }
        if(t3.getText().isEmpty()){
           rent = 0; 
        }
        else{
            rent = Double.parseDouble(t3.getText());
            total += rent;
        }
        if(t4.getText().isEmpty()){
            miles = 0;
        }
        else{
            miles = Double.parseDouble(t4.getText());
            total += miles;
        }
        if(t5.getText().isEmpty()){
            parkingFee = 0;
        }
        else{
            parkingFee = Double.parseDouble(t5.getText());
            total += parkingFee;
        }
        if(t6.getText().isEmpty()){
            taxiFee = 0;
        }
        else {
            taxiFee = Double.parseDouble(t6.getText());
            total += taxiFee;
        }
        if(t7.getText().isEmpty()){
            otherFee = 0;
        }
        else{
            otherFee = Double.parseDouble(t7.getText());
            total += otherFee;
        }
        return total;
    }
    public double allowableExpense(){
        double allowable = 0;
    double compMeal = 37, compPark = 10, compTaxi = 20, compLodge = 95, compDrive = 0.27;
    double tot = compMeal + compPark + compTaxi + compLodge + compDrive;
    if(!t4.getText().isEmpty()){
    allowable += Double.parseDouble(t4.getText())* compDrive;
    }
    if(!t5.getText().isEmpty()){
        allowable += Double.parseDouble(t1.getText())* compPark;
    }
    if(!t6.getText().isEmpty()){
        allowable += Double.parseDouble(t1.getText())* compTaxi;
    }
    allowable += Double.parseDouble(t1.getText())* compLodge;
    allowable += Double.parseDouble(t1.getText())* compMeal;
    return allowable;
    }
    public double additional(){
    return getTotal() - allowableExpense();
    }
    public double savedAmount(){
        if(getTotal() - allowableExpense() < 0){
            return allowableExpense() - getTotal();
        }
        else 
            return 0;
    }
}
