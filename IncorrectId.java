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
public class IncorrectId extends Exception {

    /**
     * Creates a new instance of <code>IncorrectId</code> without detail
     * message.
     */
    public IncorrectId() {
        super("Incorrect id");
    }

    /**
     * Constructs an instance of <code>IncorrectId</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectId(String msg) {
        super(msg);
    }
}
