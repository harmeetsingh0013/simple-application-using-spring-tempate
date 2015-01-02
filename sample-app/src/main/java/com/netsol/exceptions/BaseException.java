/**
 * 
 */
package com.netsol.exceptions;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@SuppressWarnings("serial")
public class BaseException extends Exception{

	private String errorCode;
	
	public BaseException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	public String toString() {
		return errorCode + " - "+getMessage();
	}
}
