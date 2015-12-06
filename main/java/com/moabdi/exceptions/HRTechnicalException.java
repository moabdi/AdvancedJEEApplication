/**
 * 
 */
package com.moabdi.exceptions;

/**
 * @author Mostapha
 *
 */
public class HRTechnicalException extends RuntimeException{


    public HRTechnicalException() {
    }

    public HRTechnicalException(String message) {
        super(message);
    }

    public HRTechnicalException(Throwable cause) {
        super(cause);
    }

	public HRTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }
}
