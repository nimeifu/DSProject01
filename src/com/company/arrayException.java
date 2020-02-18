package com.company;

/**
 * Handle exceptions caused by run time.
 */
public class arrayException extends RuntimeException {
    /**
     * Constructs an object with specific message.
     * @param message A string literal specifying the details of this exception
     */
    public arrayException(String message)
    {
        super(message);
    }
}
