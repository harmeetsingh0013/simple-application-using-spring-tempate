/**
 * 
 */
package com.netsol.exceptions;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class DataNotFound extends BaseException{

	private static final long serialVersionUID = -5358589173808799082L;

	public DataNotFound(String errorCode, String message) {
		super(errorCode, message);
	}

}
