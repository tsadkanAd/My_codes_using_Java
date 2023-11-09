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
public class IncorrectName extends Exception {

    /**
     * Creates a new instance of <code>IncorrectName</code> without detail
     * message.
     */
    public IncorrectName() {
        super("Incorrect name");
    }

    /**
     * Constructs an instance of <code>IncorrectName</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectName(String msg) {
        super(msg);
    }
}
