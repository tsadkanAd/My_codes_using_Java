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
public class InvalidPrice extends Exception {

    /**
     * Creates a new instance of <code>InvalidPrice</code> without detail
     * message.
     */
    public InvalidPrice() {
        super("Invalid price");
    }

    /**
     * Constructs an instance of <code>InvalidPrice</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidPrice(String msg) {
        super(msg);
    }
}
