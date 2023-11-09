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
public class InvalidUnitsOnHand extends Exception {

    /**
     * Creates a new instance of <code>InvalidUnitsOnHand</code> without detail
     * message.
     */
    public InvalidUnitsOnHand() {
        super("Invalid units on hand");
    }

    /**
     * Constructs an instance of <code>InvalidUnitsOnHand</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidUnitsOnHand(String msg) {
        super(msg);
    }
}
