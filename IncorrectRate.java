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
public class IncorrectRate extends Exception {

    /**
     * Creates a new instance of <code>IncorrectRate</code> without detail
     * message.
     */
    public IncorrectRate() {
        super("Incorrect pay rate");
    }

    /**
     * Constructs an instance of <code>IncorrectRate</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectRate(String msg) {
        super(msg);
    }
}
