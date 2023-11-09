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
public class InvalidShift extends Exception {

    /**
     * Creates a new instance of <code>InvalidShift</code> without detail
     * message.
     */
    public InvalidShift() {
        super("Invalid shift");
    }

    /**
     * Constructs an instance of <code>InvalidShift</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidShift(String msg) {
        super(msg);
    }
}
