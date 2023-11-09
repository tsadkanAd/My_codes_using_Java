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
public class IncorrectMonthNumber extends Exception {

    /**
     * Creates a new instance of <code>IncorrectMonthNumber</code> without
     * detail message.
     */
    public IncorrectMonthNumber() {
        super("Incorrect month number");
    }

    /**
     * Constructs an instance of <code>IncorrectMonthNumber</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectMonthNumber(String msg) {
        super(msg);
    }
}
