package com.company;

/**
 * Handle exceptions caused by Index Out of Bounds.
 */


public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException {
    /**
     * Constructs an object with specific message.
     * @param message A string literal specifying the details of this exception
     */
    public ArrayIndexOutOfBoundsException(String message)
    {
        super (message);
    }
}
