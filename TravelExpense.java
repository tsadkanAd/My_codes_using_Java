/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author TA
 */
public class TravelExpense extends JFrame{
    private DataPanel data;
    private TitlePanel title;
    private JPanel panel;
    private JButton calculate, exit;
    public TravelExpense(){
        setTitle("Travel Expense");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data = new DataPanel();
        title = new TitlePanel();
        panel = new JPanel();
        calculate = new JButton("Calculate");
        calculate.addActionListener(new CalcActionListener());
        exit = new JButton("Exit");
        exit.addActionListener(new exitActionListener());
        //panel.setLayout(new GridLayout(3,1));
        add(title,BorderLayout.NORTH);
        add(data, BorderLayout.EAST);
        panel.add(calculate);
        panel.add(exit);
        //add(title);
        add(panel);
        pack();
        setVisible(true);
    }
    private class CalcActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Total expenses incurred by the business person"+data.getTotal()+
                    "\nThe total allowable expenses for the trip"+data.allowableExpense()+
                    "\nThe excess that must be paid by the business person"+data.additional()+
                   "The amount saved by the business person"+data.savedAmount());
        }
    }
    private class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        new TravelExpense();

    }
}
