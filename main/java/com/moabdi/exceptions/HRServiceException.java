/**
 * 
 */
package com.moabdi.exceptions;

/**
 * @author Mostapha
 *
 */
public class HRServiceException extends Exception {

	
    public HRServiceException() {
    }

    public HRServiceException(String message) {
        super(message);
    }

    public HRServiceException(Throwable cause) {
        super(cause);
    }

	public HRServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
