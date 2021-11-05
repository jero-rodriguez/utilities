package com.jero.personal.utilities.exception;

/**
 * The type Controlled api exception.
 */
public class ControlledApiException extends Exception {

    /**
     * Instantiates a new Controlled api exception.
     *
     * @param errorMessage the error message
     * @param cause        the cause
     */
    public ControlledApiException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
