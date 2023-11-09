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
public class InvalidPayRate extends Exception {

    /**
     * Creates a new instance of <code>InvalidPayRate</code> without detail
     * message.
     */
    public InvalidPayRate() {
        super("Invalid pay rate");
    }

    /**
     * Constructs an instance of <code>InvalidPayRate</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidPayRate(String msg) {
        super(msg);
    }
}
