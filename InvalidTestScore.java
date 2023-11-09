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
public class InvalidTestScore extends Exception {

    /**
     * Creates a new instance of <code>InvalidTestScore</code> without detail
     * message.
     */
    public InvalidTestScore() {
        super("Invalid test score");
    }

    /**
     * Constructs an instance of <code>InvalidTestScore</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidTestScore(String msg) {
        super(msg);
    }
}
