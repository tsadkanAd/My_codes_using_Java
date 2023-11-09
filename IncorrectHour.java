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
public class IncorrectHour extends Exception {

    /**
     * Creates a new instance of <code>IncorrectHour</code> without detail
     * message.
     */
    public IncorrectHour() {
        super("Incorrect hour");
    }

    /**
     * Constructs an instance of <code>IncorrectHour</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectHour(String msg) {
        super(msg);
    }
}
