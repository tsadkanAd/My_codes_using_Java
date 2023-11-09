/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import javax.swing.*;
/**
 *
 * @author TA
 */
public class TitlePanel extends JPanel {
    private JLabel title;
    public TitlePanel(){
        title = new JLabel("Travel Expense\nLabels written in red must be field");
        add(title);
    }
}
